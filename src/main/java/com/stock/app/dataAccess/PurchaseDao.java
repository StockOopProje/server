package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Purchase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseDao extends JpaRepository<Purchase,Integer> {
    List<Purchase> getByVendor_id(int id);
}
