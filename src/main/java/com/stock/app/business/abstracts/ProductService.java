package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.dtos.ProductDto;

public interface ProductService {
    Result getAll();
    Result isEnoughStock(int id);
    Result addProduct(ProductDto product);
    Result displayProduct(int id);
    Result deleteProduct(int id);
    Result updateProduct(ProductDto product);
}
