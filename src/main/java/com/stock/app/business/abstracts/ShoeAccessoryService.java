package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.ShoeAccessory;

public interface ShoeAccessoryService {
    Result getAll();
    Result addShoeAccessory(ShoeAccessory shoeAccessory);
    Result displayShoeAccessory(int id);
    Result deleteShoeAccessory(int id);
    Result updateShoeAccessory(ShoeAccessory shoeAccessory);
}
