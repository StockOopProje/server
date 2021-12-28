package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Customer;
import com.stock.app.entities.concretes.Product;

import java.util.ArrayList;

public interface CustomerService {
    Result addCustomer(Customer customer);
    Result listSales();
    Result displayCustomer(int id);
    Result deleteCustomer(int id);
    Result updateCustomer(int id, String name, String company_name, String address, String cell_phone, String email);
}
