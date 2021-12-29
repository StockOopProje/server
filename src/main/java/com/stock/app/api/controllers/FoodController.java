package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.FoodService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Food;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/food")
@RequiredArgsConstructor
public class FoodController {

    @Autowired
    private FoodService foodService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return foodService.getAll();
    }

    @PostMapping("/addFood")
    public Result addFood(@RequestBody Food food){
        return foodService.addFood(food);
    }

    @PostMapping("/displayFood")
    public Result displayFood(@RequestBody Food food){
        return foodService.displayFood(food.getId());
    }

    @PostMapping("/deleteFood")
    public Result deleteFood(@RequestBody Food food){
        return foodService.deleteFood(food.getId());
    }

    @PostMapping("/updateFood")
    public Result updateFood(@RequestBody Food food){
        return foodService.updateFood(food);
    }
}
