package com.stock.app.entities.concretes;

import lombok.AllArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@Entity(name="Customer")
public class Customer extends Person{
}
