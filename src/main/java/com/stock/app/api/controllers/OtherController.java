package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.OtherService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Other;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/other")
@RequiredArgsConstructor
public class OtherController {

    @Autowired
    private OtherService otherService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return otherService.getAll();
    }

    @PostMapping("/addOther")
    public Result addOther(@RequestBody Other other){
        return otherService.addOther(other);
    }

    @PostMapping("/displayOther")
    public Result displayOther(@RequestBody Other other){
        return otherService.displayOther(other.getId());
    }

    @PostMapping("/deleteOther")
    public Result deleteOther(@RequestBody Other other){
        return otherService.deleteOther(other.getId());
    }

    @PostMapping("/updateOther")
    public Result updateOther(@RequestBody Other other){
        return otherService.updateOther(other);
    }
}
