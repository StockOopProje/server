package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.PurchaseService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Purchase;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path="/api/purchase")
@RequiredArgsConstructor
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return purchaseService.getAll();
    }

    @PostMapping(path ="/purchaseProduct")
    public Result purchaseProduct(@RequestBody Purchase purchase){
        return purchaseService.purchaseProduct(purchase);
    }

    @PostMapping(path ="/deletePurchase")
    public Result deletePurchase(@RequestBody Purchase purchase){
        return purchaseService.deletePurchase(purchase);
    }
}
