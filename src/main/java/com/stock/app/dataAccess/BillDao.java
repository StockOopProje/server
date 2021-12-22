package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Bill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillDao extends JpaRepository<Bill,Integer> {
}
