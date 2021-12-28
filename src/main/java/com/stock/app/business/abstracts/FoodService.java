package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Food;


public interface FoodService {
    Result getAll();
    Result addFood(Food food);
    Result displayFood(int id);
    Result deleteFood(int id);
    Result updateFood(Food food);
}
