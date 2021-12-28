package com.stock.app.business.abstracts;

import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Bill;
import com.stock.app.entities.concretes.ZReport;

public interface ZReportService {
    Result displayZReportDaily();
    Result displayZReportMonthly();
    Result extractToExcel();
    Result extractToPDF();
    Result isProfit();
    Result insertZReport(Bill bill);
}
