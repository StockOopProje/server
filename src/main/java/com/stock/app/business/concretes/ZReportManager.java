package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.ZReportService;
import com.stock.app.core.results.Result;
import com.stock.app.dataAccess.ZReportDao;
import com.stock.app.entities.concretes.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZReportManager implements ZReportService {
    private ZReportDao zReportDao;

    @Autowired
    public ZReportManager (ZReportDao zReportDao) {
        super();
        this.zReportDao = zReportDao;
    }

    @Override
    public Result displayZReportDaily() {
        return null;
    }

    @Override
    public Result displayZReportMonthly() {
        return null;
    }

    @Override
    public Result extractToExcel() {
        return null;
    }

    @Override
    public Result extractToPDF() {
        return null;
    }

    @Override
    public Result isProfit() {
        return null;
    }

    @Override
    public Result insertZReport(Bill bill) {
        return null;
    }
}
