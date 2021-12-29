package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.ShoeAccessoryService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.ShoeAccessory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/shoeAccessory")
@RequiredArgsConstructor
public class ShoeAccessoryController {

    @Autowired
    private ShoeAccessoryService shoeAccessoryService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return shoeAccessoryService.getAll();
    }

    @PostMapping("/addShoeAccessory")
    public Result addShoeAccessory(@RequestBody ShoeAccessory shoeAccessory){
        return shoeAccessoryService.addShoeAccessory(shoeAccessory);
    }

    @PostMapping("/displayShoeAccessory")
    public Result displayShoeAccessory(@RequestBody ShoeAccessory shoeAccessory){
        return shoeAccessoryService.displayShoeAccessory(shoeAccessory.getId());
    }

    @PostMapping("/deleteShoeAccessory")
    public Result deleteShoeAccessory(@RequestBody ShoeAccessory shoeAccessory){
        return shoeAccessoryService.deleteShoeAccessory(shoeAccessory.getId());
    }

    @PostMapping("/updateShoeAccessory")
    public Result updateShoeAccessory(@RequestBody ShoeAccessory shoeAccessory){
        return shoeAccessoryService.updateShoeAccessory(shoeAccessory);
    }
}
