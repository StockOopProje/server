package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Book;
import com.stock.app.entities.concretes.Clothing;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Sale;

import java.util.List;

public interface ClothingService {
    Result getAll();
    Result addClothing(Clothing clothing);
    Result displayClothing(int id);
    Result deleteClothing(int id);
    Result updateClothing(Clothing clothing);
}
