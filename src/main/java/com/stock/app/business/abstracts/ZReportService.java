package com.stock.app.business.abstracts;

import com.stock.app.entities.concretes.Bill;
import com.stock.app.entities.concretes.ZReport;

public interface ZReportService {
    ZReport displayZReportDaily();
    ZReport displayZReportMonthly();
    String extractToExcel();
    String extractToPDF();
    boolean isProfit();
    ZReport insertZReport(Bill bill);
}
