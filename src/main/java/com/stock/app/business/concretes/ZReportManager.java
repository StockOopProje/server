package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.ZReportService;
import com.stock.app.dataAccess.VendorDao;
import com.stock.app.dataAccess.ZReportDao;
import com.stock.app.entities.concretes.Bill;
import com.stock.app.entities.concretes.ZReport;
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
    public ZReport displayZReportDaily() {
        return null;
    }

    @Override
    public ZReport displayZReportMonthly() {
        return null;
    }

    @Override
    public String extractToExcel() {
        return null;
    }

    @Override
    public String extractToPDF() {
        return null;
    }

    @Override
    public boolean isProfit() {
        return false;
    }

    @Override
    public ZReport insertZReport(Bill bill) {
        return null;
    }
}
