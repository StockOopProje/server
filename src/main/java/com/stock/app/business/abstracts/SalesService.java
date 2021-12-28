package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Product;

public interface SalesService {
    Result saleProduct(Product product);
}
