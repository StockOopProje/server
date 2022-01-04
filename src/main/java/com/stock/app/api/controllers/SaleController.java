package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.SaleService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Sale;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path="/api/sale")
@RequiredArgsConstructor
public class SaleController {

    @Autowired
    private SaleService saleService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return saleService.getAll();
    }

    @PostMapping(path="/saleProduct")
    public Result saleProduct(@RequestBody Sale sale){
        return saleService.saleProduct(sale);
    }
}
