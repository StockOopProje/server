package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Other;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OtherDao extends JpaRepository<Other,Integer> {
}
