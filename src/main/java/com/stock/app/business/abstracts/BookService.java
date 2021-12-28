package com.stock.app.business.abstracts;


import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Book;

public interface BookService {
    Result getAll();
    Result addBook(Book book);
    Result displayBook(int id);
    Result deleteBook(int id);
    Result updateBook(Book book);
}
