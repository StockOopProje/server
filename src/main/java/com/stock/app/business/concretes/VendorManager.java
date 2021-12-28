package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.VendorService;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.VendorDao;
import com.stock.app.entities.concretes.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class VendorManager implements VendorService {
    private VendorDao vendorDao;

    @Autowired
    public VendorManager (VendorDao vendorDao) {
        super();
        this.vendorDao = vendorDao;
    }

    @Override
    public Result listPurchases() {
        //--------------------
        return null;
    }

    @Override
    public Result displayVendor(int id) {
        //--------------
        return null;
    }

    @Override
    public Result deleteVendor(int id) {
        this.vendorDao.deleteById(id);
        return new SuccessResult();
    }

    @Override
    public Result updateVendor(int id, String name, String company_name, String address, String cell_phone, String email) {
        Vendor vendor;
        vendor = this.vendorDao.getById(id);

        if(!Objects.isNull(vendor)){
            vendor.setName(name);
            vendor.setCompany_name(company_name);
            vendor.setAddress(address);
            vendor.setCell_phone(cell_phone);
            vendor.setEmail(email);
            this.vendorDao.save(vendor);
        }
        return new SuccessDataResult<Vendor>(vendor);
    }

    @Override
    public Result addVendor(Vendor vendor) {

        this.vendorDao.save(vendor);

        return new SuccessDataResult<Vendor>(vendor);
    }
}

