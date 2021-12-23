package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Customer;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Vendor;

import java.util.ArrayList;

public interface VendorService {
    Vendor addVendor(Vendor vendor);
    ArrayList<Product> listPurchases();
    Vendor displayVendor(int id);
    String deleteVendor(int id);
    Vendor updateVendor(int id, String name, String company_name, String address, String cell_phone, String email);
}
