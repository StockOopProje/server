package com.stock.app.entities.dtos;

import com.stock.app.entities.concretes.Purchase;
import com.stock.app.entities.concretes.Sale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Zreport {
    private List<Purchase> purchases;
    private List<Sale> sales;
    private double profit;
}
