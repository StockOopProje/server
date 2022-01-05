package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Purchase;

public interface PurchaseService {
    Result getAll();
    Result purchaseProduct(Purchase purchase);
    Result deletePurchase(Purchase purchase);
}
