package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.CustomerService;
import com.stock.app.core.adapters.ControlAdapter;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.CustomerDao;
import com.stock.app.dataAccess.SaleDao;
import com.stock.app.entities.concretes.Customer;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CustomerManager implements CustomerService {

    private CustomerDao customerDao;
    private SaleDao saleDao;
    private ControlAdapter controlAdapter;

    @Autowired
    public CustomerManager (CustomerDao customerDao,SaleDao saleDao) {
        super();
        this.customerDao = customerDao;
        this.saleDao = saleDao;
        controlAdapter = new ControlAdapter();
    }

    @Override
    public Result addCustomer(Customer customer) {
        if(!controlAdapter.checkCellPhoneAndEmail(customer.getCell_phone(),customer.getEmail())){
            return new ErrorResult();
        }
        customerDao.save(customer);
        return new SuccessDataResult<Customer>(customer);
    }

    @Override
    public Result listSales(int id) {
        return new SuccessDataResult<List<Sale>>(saleDao.getByCustomer_id(id));
    }

    @Override
    public Result displayCustomer(int id) {
        return new SuccessDataResult<Customer>(customerDao.getById(id));
    }

    @Override
    public Result deleteCustomer(int id) {
        try {
            customerDao.deleteById(id);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }

    @Override
    public Result updateCustomer(Customer customer) {
        if(!controlAdapter.checkCellPhoneAndEmail(customer.getCell_phone(),customer.getEmail())){
            return new ErrorResult();
        }
        try {
            customerDao.save(customer);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }
}
