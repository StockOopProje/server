package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.ShoeAccessory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoeAccessoryDao extends JpaRepository<ShoeAccessory,Integer> {
}
