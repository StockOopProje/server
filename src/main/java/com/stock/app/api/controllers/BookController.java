package com.stock.app.api.controllers;

import com.stock.app.business.abstracts.BookService;
import com.stock.app.core.results.Result;
import com.stock.app.entities.concretes.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/api/book")
@RequiredArgsConstructor
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping(path="/getAll")
    public Result getAll(){
        return bookService.getAll();
    }

    @PostMapping("/addBook")
    public Result addBook(@RequestBody Book book){
        return bookService.addBook(book);
    }

    @PostMapping("/displayBook")
    public Result displayBook(@RequestBody Book book){
        return bookService.displayBook(book.getId());
    }

    @PostMapping("/deleteBook")
    public Result deleteBook(@RequestBody Book book){
        return bookService.deleteBook(book.getId());
    }

    @PostMapping("/updateBook")
    public Result updateBook(@RequestBody Book book){
        return bookService.updateBook(book);
    }

}
