package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Fashion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FashionDao extends JpaRepository<Fashion,Integer> {
}
