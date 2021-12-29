package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.FashionService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Fashion;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/fashion")
@RequiredArgsConstructor
public class FashionController {

    @Autowired
    private FashionService fashionService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return fashionService.getAll();
    }

    @PostMapping("/addFashion")
    public Result addFashion(@RequestBody Fashion fashion){
        return fashionService.addFashion(fashion);
    }

    @PostMapping("/displayFashion")
    public Result displayFashion(@RequestBody Fashion fashion){
        return fashionService.displayFashion(fashion.getId());
    }

    @PostMapping("/deleteFashion")
    public Result deleteFashion(@RequestBody Fashion fashion){
        return fashionService.deleteFashion(fashion.getId());
    }

    @PostMapping("/updateFashion")
    public Result updateFashion(@RequestBody Fashion fashion){
        return fashionService.updateFashion(fashion);
    }
}
