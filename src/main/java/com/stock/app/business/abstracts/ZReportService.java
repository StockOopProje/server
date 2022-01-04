package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Bill;

import java.util.Date;

public interface ZReportService {
    Result displayZReportDaily(Date date);
    Result displayZReportMonthly(Date date);
    Result displayZReportByDates(Date start,Date finish);
}
