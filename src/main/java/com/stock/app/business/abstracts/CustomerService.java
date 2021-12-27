package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Customer;
import com.stock.app.entities.concretes.Product;

import java.util.ArrayList;

public interface CustomerService {
    Customer addCustomer(Customer customer);
    ArrayList<Product> listSales();
    Customer displayCustomer(int id);
    String deleteCustomer(int id);
    Customer updateCustomer(int id, String name, String company_name, String address, String cell_phone, String email);
}
