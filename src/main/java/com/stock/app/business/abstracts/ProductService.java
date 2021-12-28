package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Sale;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
    boolean isEnoughStock(Sale sale);
}
