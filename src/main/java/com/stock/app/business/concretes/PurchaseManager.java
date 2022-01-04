package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.PurchaseService;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.dataAccess.CustomerDao;
import com.stock.app.dataAccess.PurchaseDao;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Purchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseManager implements PurchaseService {
    private PurchaseDao purchaseDao;

    @Autowired
    public PurchaseManager (PurchaseDao purchaseDao) {
        super();
        this.purchaseDao = purchaseDao;
    }

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Purchase>>(purchaseDao.findAll());
    }

    @Override
    public Result purchaseProduct(Purchase purchase) {
        purchaseDao.save(purchase);
        return new SuccessDataResult<Purchase>(purchase);
    }
}
