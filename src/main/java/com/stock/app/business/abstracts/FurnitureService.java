package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Furniture;


public interface FurnitureService {
    Result getAll();
    Result addFurniture(Furniture furniture);
    Result displayFurniture(int id);
    Result deleteFurniture(int id);
    Result updateFurniture(Furniture furniture);
}
