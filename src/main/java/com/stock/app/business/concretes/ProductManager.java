package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.ProductService;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.ProductDao;
import com.stock.app.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager (ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Product>>(productDao.findAll());
    }


    @Override
    public Result isEnoughStock(int id) {
        Product product = productDao.getById(id);
        if(product.getMin_quantity() > product.getStock_quantity()){
            return new ErrorResult();
        }
        return new SuccessResult();
    }

}
