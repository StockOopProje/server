package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Fashion;

import java.util.List;

public interface FashionService {
    List<Fashion> getAll();
    Fashion addFashion(Fashion fashion);
    Fashion displayFashion(int id);
    String deleteFashion(int id);
    Fashion updateFashion(Fashion fashion);
}
