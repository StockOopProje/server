package com.stock.app.business.abstracts;


import com.stock.app.entities.concretes.Book;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    Book addBook(Book book);
    Book displayBook(int id);
    String deleteBook(int id);
    Book updateBook(Book book);
}
