package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClothingDao extends JpaRepository<Clothing,Integer> {
}
