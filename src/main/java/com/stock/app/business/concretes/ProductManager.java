package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.ProductService;
import com.stock.app.dataAccess.ProductDao;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductManager implements ProductService {
    private ProductDao productDao;

    @Autowired
    public ProductManager (ProductDao productDao) {
        super();
        this.productDao = productDao;
    }

    @Override
    public Product addProduct(Product product) {
        return null;
    }

    @Override
    public boolean isEnoughStock(Sale sale) {
        return false;
    }

    @Override
    public Product searchProduct() {
        return null;
    }

    @Override
    public Product displayProduct(int id) {
        return null;
    }

    @Override
    public String deleteProduct(int id) {
        return null;
    }

    @Override
    public Product updateProduct(int id, String name, int min_quantity, String barcode, String description) {
        return null;
    }
}
