package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.ProductService;
import com.stock.app.dataAccess.ProductDao;
import com.stock.app.entities.concretes.Food;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    public List<Product> getAll() {
        return productDao.findAll();
    }


    @Override
    public boolean isEnoughStock(Sale sale) {
        return false;
    }

}
