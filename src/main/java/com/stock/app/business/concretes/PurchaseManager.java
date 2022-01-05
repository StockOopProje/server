package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.PurchaseService;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.CustomerDao;
import com.stock.app.dataAccess.ProductDao;
import com.stock.app.dataAccess.PurchaseDao;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Purchase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class PurchaseManager implements PurchaseService {

    @Autowired
    private PurchaseDao purchaseDao;

    @Autowired
    private ProductDao productDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Purchase>>(purchaseDao.findAll());
    }

    @Override
    public Result purchaseProduct(Purchase purchase) {
        purchaseDao.save(purchase);
        Product product = productDao.getById(purchase.getProduct().getId());
        product.setStock_quantity(product.getStock_quantity() + purchase.getQuantity());
        productDao.save(product);
        return new SuccessDataResult<Purchase>(purchase);
    }

    @Override
    public Result deletePurchase(Purchase purchase) {
        purchaseDao.deleteById(purchase.getId());
        return new SuccessResult();
    }
}
