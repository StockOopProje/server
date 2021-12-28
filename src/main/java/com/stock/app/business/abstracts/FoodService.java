package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Food;

import java.util.List;

public interface FoodService {
    List<Food> getAll();
    Food addFood(Food food);
    Food displayFood(int id);
    String deleteFood(int id);
    Food updateFood(Food food);
}
