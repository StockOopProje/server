package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Sale;

import java.util.List;

public interface ProductService {
    Result getAll();
    Result isEnoughStock(int id);
}
