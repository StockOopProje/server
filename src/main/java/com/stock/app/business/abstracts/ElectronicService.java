package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Electronic;

import java.util.List;

public interface ElectronicService {
    Result getAll();
    Result addElectronic(Electronic electronic);
    Result displayElectronic(int id);
    Result deleteElectronic(int id);
    Result updateElectronic(Electronic electronic);
}
