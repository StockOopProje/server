package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Electronic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ElectronicDao extends JpaRepository<Electronic,Integer> {
}
