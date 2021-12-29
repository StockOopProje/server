package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.ElectronicService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Electronic;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/electronic")
@RequiredArgsConstructor
public class ElectronicController {

    @Autowired
    private ElectronicService electronicService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return electronicService.getAll();
    }

    @PostMapping("/addElectronic")
    public Result addElectronic(@RequestBody Electronic electronic){
        return electronicService.addElectronic(electronic);
    }

    @PostMapping("/displayElectronic")
    public Result displayElectronic(@RequestBody Electronic electronic){
        return electronicService.displayElectronic(electronic.getId());
    }

    @PostMapping("/deleteElectronic")
    public Result deleteElectronic(@RequestBody Electronic electronic){
        return electronicService.deleteElectronic(electronic.getId());
    }

    @PostMapping("/updateElectronic")
    public Result updateElectronic(@RequestBody Electronic electronic){
        return electronicService.updateElectronic(electronic);
    }
}
