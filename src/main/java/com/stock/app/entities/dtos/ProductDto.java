package com.stock.app.entities.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductDto {
    private int id;
    private String product_type;
    private String name;
    private int min_quantity;
    private int stock_quantity;
    private String barcode;
    private String description;
    private int pages;
    private String author;
    private String genre;
    private String fabric_type;
    private Date warranty;
    private String area_of_usage;
    private String type;
    private String gender;
    private String size;
    private String concept;
    private String unit;
    private double weight;
    private Date expiration_date;
    private Date production_date;
    private double quantity;
}
