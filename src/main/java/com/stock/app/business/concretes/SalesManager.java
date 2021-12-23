package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.SalesService;
import com.stock.app.dataAccess.PurchaseDao;
import com.stock.app.dataAccess.SaleDao;
import com.stock.app.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesManager implements SalesService {
    private SaleDao salesDao;

    @Autowired
    public SalesManager (SaleDao salesDao) {
        super();
        this.salesDao = salesDao;
    }

    @Override
    public Product saleProduct(Product product) {
        //------------
        return null;
    }
}
