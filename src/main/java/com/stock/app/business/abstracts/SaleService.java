package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Sale;

public interface SaleService {
    Result getAll();
    Result saleProduct(Sale sale);
    Result deleteSale(Sale sale);
}
