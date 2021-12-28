package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.CustomerService;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.CustomerDao;
import com.stock.app.entities.concretes.Customer;
import com.stock.app.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class CustomerManager implements CustomerService {
    private CustomerDao customerDao;

    @Autowired
    public CustomerManager (CustomerDao customerDao) {
        super();
        this.customerDao = customerDao;
    }

    @Override
    public Result listSales() {
        //--------------------
        return null;
    }

    @Override
    public Result displayCustomer(int id) {
        //--------------
        return null;
    }

    @Override
    public Result deleteCustomer(int id) {
        this.customerDao.deleteById(id);
        return new SuccessResult();
    }

    @Override
    public Result updateCustomer(int id, String name, String company_name, String address, String cell_phone, String email) {
        Customer customer;
        customer = this.customerDao.getById(id);

        if(!Objects.isNull(customer)){
            customer.setName(name);
            customer.setCompany_name(company_name);
            customer.setAddress(address);
            customer.setCell_phone(cell_phone);
            customer.setEmail(email);
            this.customerDao.save(customer);
        }
        return new SuccessDataResult<Customer>(customer);
    }

    @Override
    public Result addCustomer(Customer customer) {

        this.customerDao.save(customer);

        return new SuccessDataResult<Customer>(customer);
    }
}
