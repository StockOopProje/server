package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Other;

import java.util.List;

public interface OtherService {
    List<Other> getAll();
    Other addOther(Other other);
    Other displayOther(int id);
    String deleteOther(int id);
    Other updateOther(Other other);
}
