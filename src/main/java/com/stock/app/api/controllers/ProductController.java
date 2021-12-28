package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.ProductService;
import com.stock.app.entities.concretes.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/product")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping(path="/getAll")
    public List<Product> getAll(){
        return productService.getAll();
    }
}
