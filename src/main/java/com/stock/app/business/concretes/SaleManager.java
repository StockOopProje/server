package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.SaleService;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.dataAccess.SaleDao;
import com.stock.app.entities.concretes.Sale;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleManager implements SaleService {
    private SaleDao salesDao;

    @Autowired
    public SaleManager(SaleDao salesDao) {
        super();
        this.salesDao = salesDao;
    }

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Sale>>(salesDao.findAll());
    }

    @Override
    public Result saleProduct(Sale sale) {
        salesDao.save(sale);
        return new SuccessDataResult<Sale>(sale);
    }
}
