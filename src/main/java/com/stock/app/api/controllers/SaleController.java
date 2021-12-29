package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.SaleService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Sale;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/sale")
@RequiredArgsConstructor
public class SaleController {

    @Autowired
    private SaleService saleService;

    @PostMapping(path="/saleProduct")
    public Result saleProduct(Sale sale){
        return saleService.saleProduct(sale);
    }
}
