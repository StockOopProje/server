package com.stock.app.dataAccess;

import com.stock.app.entities.concretes.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookDao extends JpaRepository<Book,Integer> {
}
