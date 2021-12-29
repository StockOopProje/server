package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Sale;

public interface SaleService {
    Result saleProduct(Sale sale);
}
