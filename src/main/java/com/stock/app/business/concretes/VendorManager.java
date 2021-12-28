package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.VendorService;
import com.stock.app.core.adapters.ControlAdapter;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.PurchaseDao;
import com.stock.app.dataAccess.VendorDao;
import com.stock.app.entities.concretes.Purchase;
import com.stock.app.entities.concretes.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorManager implements VendorService {
    private VendorDao vendorDao;
    private PurchaseDao purchaseDao;
    private ControlAdapter controlAdapter;

    @Autowired
    public VendorManager (VendorDao vendorDao,PurchaseDao purchaseDao) {
        super();
        this.vendorDao = vendorDao;
        this.purchaseDao = purchaseDao;
        this.controlAdapter = new ControlAdapter();
    }

    @Override
    public Result addVendor(Vendor vendor) {
        if(!controlAdapter.checkCellPhoneAndEmail(vendor.getCell_phone(),vendor.getEmail())){
            return new ErrorResult();
        }
        vendorDao.save(vendor);
        return new SuccessDataResult<Vendor>(vendor);
    }

    @Override
    public Result listPurchases(int id) {
        return new SuccessDataResult<List<Purchase>>(purchaseDao.getByVendor_id(id));
    }

    @Override
    public Result displayVendor(int id) {
        return new SuccessDataResult<Vendor>(vendorDao.getById(id));
    }

    @Override
    public Result deleteVendor(int id) {
        try {
            vendorDao.deleteById(id);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }

    @Override
    public Result updateVendor(Vendor vendor) {
        if(!controlAdapter.checkCellPhoneAndEmail(vendor.getCell_phone(),vendor.getEmail())){
            return new ErrorResult();
        }
        try {
            vendorDao.save(vendor);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }
}

