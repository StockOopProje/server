package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Furniture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FurnitureDao extends JpaRepository<Furniture,Integer> {
}
