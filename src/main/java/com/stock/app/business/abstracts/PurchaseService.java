package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Product;

public interface PurchaseService {
    Product purchaseProduct(Product product);
}
