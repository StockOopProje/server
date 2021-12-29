package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.ClothingService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Clothing;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/clothing")
@RequiredArgsConstructor
public class ClothingController {

    @Autowired
    private ClothingService clothingService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return clothingService.getAll();
    }

    @PostMapping("/addClothing")
    public Result addClothing(@RequestBody Clothing clothing){
        return clothingService.addClothing(clothing);
    }

    @PostMapping("/displayClothing")
    public Result displayClothing(@RequestBody Clothing clothing){
        return clothingService.displayClothing(clothing.getId());
    }

    @PostMapping("/deleteClothing")
    public Result deleteClothing(@RequestBody Clothing clothing){
        return clothingService.deleteClothing(clothing.getId());
    }

    @PostMapping("/updateClothing")
    public Result updateClothing(@RequestBody Clothing clothing){
        return clothingService.updateClothing(clothing);
    }
}
