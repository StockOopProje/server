package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.VendorService;
import com.stock.app.dataAccess.VendorDao;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Vendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public ArrayList<Product> listPurchases() {
        //--------------------
        return null;
    }

    @Override
    public Vendor displayVendor(int id) {
        //--------------
        return null;
    }

    @Override
    public String deleteVendor(int id) {
        this.vendorDao.deleteById(id);
        return "Basarili";
    }

    @Override
    public Vendor updateVendor(int id, String name, String company_name, String address, String cell_phone, String email) {
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
        return vendor;
    }

    @Override
    public Vendor addVendor(Vendor vendor) {

        this.vendorDao.save(vendor);

        return vendor;
    }
}

