package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchaseDao extends JpaRepository<Purchase,Integer> {
}
