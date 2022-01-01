package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.ProductService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.dtos.ProductDto;
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

    @PostMapping(path="/isEnoughStock")
    public Result isEnoughStock(@RequestBody ProductDto product){
        return productService.isEnoughStock(product.getId());
    }

    @PostMapping(path="/addProduct")
    public Result addProduct(@RequestBody ProductDto product){
        return productService.addProduct(product);
    }

    @PostMapping(path="/displayProduct")
    public Result displayProduct(@RequestBody ProductDto product){
        return productService.displayProduct(product.getId());
    }

    @PostMapping(path="/deleteProduct")
    public Result deleteProduct(@RequestBody ProductDto product){
        return productService.deleteProduct(product.getId());
    }

    @PostMapping(path="/updateProduct")
    public Result updateProduct(@RequestBody ProductDto product){
        return productService.updateProduct(product);
    }

}
