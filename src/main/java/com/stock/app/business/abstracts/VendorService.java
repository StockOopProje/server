package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Customer;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Vendor;

import java.util.ArrayList;

public interface VendorService {
    Result addVendor(Vendor vendor);
    Result listPurchases(int id);
    Result displayVendor(int id);
    Result deleteVendor(int id);
    Result updateVendor(Vendor vendor);
}
