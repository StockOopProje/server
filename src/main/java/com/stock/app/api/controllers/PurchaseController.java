package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.PurchaseService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Purchase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @PostMapping(path ="/purchaseProduct")
    public Result purchaseProduct(Purchase purchase){
        return purchaseService.purchaseProduct(purchase);
    }
}
