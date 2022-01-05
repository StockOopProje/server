package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.SaleService;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.ProductDao;
import com.stock.app.dataAccess.SaleDao;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Sale;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SaleManager implements SaleService {

    @Autowired
    private SaleDao salesDao;

    @Autowired
    private ProductDao productDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Sale>>(salesDao.findAll());
    }

    @Override
    public Result saleProduct(Sale sale) {
        if(sale.getProduct().getStock_quantity() - sale.getQuantity() < 0){
            return new ErrorResult("Not enough stock");
        }
        sale.getProduct().setStock_quantity(sale.getProduct().getStock_quantity() - sale.getQuantity());
        salesDao.save(sale);
        Product product = productDao.getById(sale.getProduct().getId());
        product.setStock_quantity(sale.getProduct().getStock_quantity() - sale.getQuantity());
        productDao.save(product);
        return new SuccessDataResult<Sale>(sale);
    }

    @Override
    public Result deleteSale(Sale sale) {
        salesDao.deleteById(sale.getId());
        return new SuccessResult();
    }
}
