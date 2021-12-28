package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Book;
import com.stock.app.entities.concretes.Clothing;
import com.stock.app.entities.concretes.Product;
import com.stock.app.entities.concretes.Sale;

import java.util.List;

public interface ClothingService {
    List<Clothing> getAll();
    Clothing addClothing(Clothing clothing);
    Clothing displayClothing(int id);
    String deleteClothing(int id);
    Clothing updateClothing(Clothing clothing);
}
