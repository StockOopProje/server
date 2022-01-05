package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorDao extends JpaRepository<Vendor,Integer> {
}
