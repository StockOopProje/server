package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Other;


public interface OtherService {
    Result getAll();
    Result addOther(Other other);
    Result displayOther(int id);
    Result deleteOther(int id);
    Result updateOther(Other other);
}
