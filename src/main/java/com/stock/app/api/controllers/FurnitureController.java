package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.FurnitureService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Furniture;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/furniture")
@RequiredArgsConstructor
public class FurnitureController {

    @Autowired
    private FurnitureService furnitureService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return furnitureService.getAll();
    }

    @PostMapping("/addFurniture")
    public Result addFurniture(@RequestBody Furniture furniture){
        return furnitureService.addFurniture(furniture);
    }

    @PostMapping("/displayFurniture")
    public Result displayFurniture(@RequestBody Furniture furniture){
        return furnitureService.displayFurniture(furniture.getId());
    }

    @PostMapping("/deleteFurniture")
    public Result deleteFurniture(@RequestBody Furniture furniture){
        return furnitureService.deleteFurniture(furniture.getId());
    }

    @PostMapping("/updateFurniture")
    public Result updateFurniture(@RequestBody Furniture furniture){
        return furnitureService.updateFurniture(furniture);
    }
}
