package com.stock.app.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Clothing")
public class Clothing extends Fashion{
    private String fabric_type;
}
