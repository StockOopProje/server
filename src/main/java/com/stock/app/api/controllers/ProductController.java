package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.ProductService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return productService.getAll();
    }

    public Result isEnoughStock(@RequestBody Product product){
        return productService.isEnoughStock(product.getId());
    }
}
