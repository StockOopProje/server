package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.ZReportService;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.dataAccess.PurchaseDao;
import com.stock.app.dataAccess.SaleDao;
import com.stock.app.entities.concretes.Purchase;
import com.stock.app.entities.concretes.Sale;
import com.stock.app.entities.dtos.Zreport;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RequiredArgsConstructor
@Service
public class ZReportManager implements ZReportService {

    @Autowired
    private PurchaseDao purchaseDao;

    @Autowired
    private SaleDao saleDao;


    @Override
    public Result displayZReportDaily(Date date) {
        List<Purchase> purchases = purchaseDao.findAll();
        List<Sale> sales = saleDao.findAll();
        List<Purchase> purchasesTemp = new ArrayList<Purchase>();
        List<Sale> salesTemp = new ArrayList<Sale>();

        Zreport zreport = new Zreport();

        for (Purchase item:purchases) {
            if(item.getDate().getYear() == date.getYear() && item.getDate().getMonth() == date.getMonth() && item.getDate().getDate() == date.getDate()){
                purchasesTemp.add(item);
                double profit = zreport.getProfit();
                profit -= item.getQuantity() * item.getPrice();
                zreport.setProfit(profit);
            }
        }

        for (Sale item:sales) {
            if(item.getDate().getYear() == date.getYear() && item.getDate().getMonth() == date.getMonth() && item.getDate().getDate() == date.getDate()){
                salesTemp.add(item);
                double profit = zreport.getProfit();
                profit += item.getQuantity() * item.getPrice();
                zreport.setProfit(profit);
            }
        }

        zreport.setPurchases(purchasesTemp);
        zreport.setSales(salesTemp);

        return new SuccessDataResult<Zreport>(zreport);
    }

    @Override
    public Result displayZReportMonthly(Date date) {
        List<Purchase> purchases = purchaseDao.findAll();
        List<Sale> sales = saleDao.findAll();
        List<Purchase> purchasesTemp = new ArrayList<Purchase>();
        List<Sale> salesTemp = new ArrayList<Sale>();

        Zreport zreport = new Zreport();

        for (Purchase item:purchases) {
            if(item.getDate().getYear() == date.getYear() && item.getDate().getMonth() == date.getMonth()){
                purchasesTemp.add(item);
                double profit = zreport.getProfit();
                profit -= item.getQuantity() * item.getPrice();
                zreport.setProfit(profit);
            }
        }

        for (Sale item:sales) {
            if(item.getDate().getYear() == date.getYear() && item.getDate().getMonth() == date.getMonth()){
                salesTemp.add(item);
                double profit = zreport.getProfit();
                profit += item.getQuantity() * item.getPrice();
                zreport.setProfit(profit);
            }
        }

        zreport.setPurchases(purchasesTemp);
        zreport.setSales(salesTemp);

        return new SuccessDataResult<Zreport>(zreport);
    }

    @Override
    public Result displayZReportByDates(Date start, Date finish) {
        List<Purchase> purchases = purchaseDao.findAll();
        List<Sale> sales = saleDao.findAll();
        List<Purchase> purchasesTemp = new ArrayList<Purchase>();
        List<Sale> salesTemp = new ArrayList<Sale>();

        Zreport zreport = new Zreport();

        for (Purchase item:purchases) {
            if(start.getTime() < item.getDate().getTime() && finish.getTime() > item.getDate().getTime()){
                purchasesTemp.add(item);
                double profit = zreport.getProfit();
                profit -= item.getQuantity() * item.getPrice();
                zreport.setProfit(profit);
            }
        }

        for (Sale item:sales) {
            if(start.getTime() < item.getDate().getTime() && finish.getTime() > item.getDate().getTime()){
                salesTemp.add(item);
                double profit = zreport.getProfit();
                profit += item.getQuantity() * item.getPrice();
                zreport.setProfit(profit);
            }
        }

        zreport.setPurchases(purchasesTemp);
        zreport.setSales(salesTemp);

        return new SuccessDataResult<Zreport>(zreport);
    }
}
