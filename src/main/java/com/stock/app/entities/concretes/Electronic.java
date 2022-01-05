package com.stock.app.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Electronic")
public class Electronic extends Product{
    private Date warranty;
    private String area_of_usage;
    private String type;
}
