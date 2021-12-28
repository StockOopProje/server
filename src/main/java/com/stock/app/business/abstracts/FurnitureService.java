package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Furniture;

import java.util.List;

public interface FurnitureService {
    List<Furniture> getAll();
    Furniture addFurniture(Furniture furniture);
    Furniture displayFurniture(int id);
    String deleteFurniture(int id);
    Furniture updateFurniture(Furniture furniture);
}
