package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Other;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Sale;
import com.stock.app.entities.concretes.ShoeAccessory;

import java.util.List;

public interface ShoeAccessoryService {
    List<ShoeAccessory> getAll();
    ShoeAccessory addShoeAccessory(ShoeAccessory shoeAccessory);
    ShoeAccessory displayShoeAccessory(int id);
    String deleteShoeAccessory(int id);
    ShoeAccessory updateShoeAccessory(ShoeAccessory shoeAccessory);
}
