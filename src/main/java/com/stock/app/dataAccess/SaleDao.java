package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleDao extends JpaRepository<Sale,Integer> {
}
