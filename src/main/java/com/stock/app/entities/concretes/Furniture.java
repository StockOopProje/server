package com.stock.app.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Furniture")
public class Furniture extends Product{
    private String concept;
    private Date warranty;
    private String unit;
    private double weight;
}
