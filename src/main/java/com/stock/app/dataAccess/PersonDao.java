package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonDao extends JpaRepository<Person,Integer> {
}
