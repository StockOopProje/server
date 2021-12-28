package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Electronic;

import java.util.List;

public interface ElectronicService {
    List<Electronic> getAll();
    Electronic addElectronic(Electronic electronic);
    Electronic displayElectronic(int id);
    String deleteElectronic(int id);
    Electronic updateElectronic(Electronic electronic);
}
