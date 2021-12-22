package com.stock.app.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Fashion")
public class Fashion extends Product{
    private String gender;
    private String type;
    private String size;
}
