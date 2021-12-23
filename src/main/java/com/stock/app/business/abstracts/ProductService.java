package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Sale;

public interface ProductService {
    Product addProduct(Product product);
    boolean isEnoughStock(Sale sale);
    Product searchProduct();
    Product displayProduct(int id);
    String deleteProduct(int id);
    Product updateProduct(int id, String name, int min_quantity, String barcode, String description);
}
