package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodDao extends JpaRepository<Food,Integer> {
}
