package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SaleDao extends JpaRepository<Sale,Integer> {
    List<Sale> getByCustomer_id(int id);
}
