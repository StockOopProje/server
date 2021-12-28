package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Fashion;

public interface FashionService {
    Result getAll();
    Result addFashion(Fashion fashion);
    Result displayFashion(int id);
    Result deleteFashion(int id);
    Result updateFashion(Fashion fashion);
}
