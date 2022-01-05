package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.ZReportService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.dtos.GetDates;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path="/api/zreport")
@RequiredArgsConstructor
public class ZreportController {

    @Autowired
    private ZReportService zReportService;

    @PostMapping(path="/displayZReportDaily")
    Result displayZReportDaily(@RequestBody Date date){
        return zReportService.displayZReportDaily(date);
    }

    @PostMapping(path="/displayZReportMonthly")
    Result displayZReportMonthly(@RequestBody Date date){
        return zReportService.displayZReportMonthly(date);
    }

    @PostMapping(path="/displayZReportByDates")
    Result displayZReportByDates(@RequestBody GetDates getDates){
        return zReportService.displayZReportByDates(getDates.getStart(),getDates.getFinish());
    }
}
