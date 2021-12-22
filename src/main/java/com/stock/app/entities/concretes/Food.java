package com.stock.app.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Food")
public class Food extends Product{
    private Date expiration_date;
    private String unit;
    private Date production_date;
    private double quantity;
}
