package com.stock.app.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="ZReport")
@Inheritance(strategy = InheritanceType.JOINED)
public class ZReport {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String product_name;
    private int quantity;
    private double cost;
    private Date date;
    private LocalTime time;
    private boolean isProfit;
}
