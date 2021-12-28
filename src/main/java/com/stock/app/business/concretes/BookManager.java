package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.BookService;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.BookDao;
import com.stock.app.entities.concretes.Book;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookManager implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Book>>(bookDao.findAll());
    }

    @Override
    public Result addBook(Book book) {
        bookDao.save(book);
        return new SuccessResult();
    }

    @Override
    public Result displayBook(int id) {
        return new SuccessDataResult<Optional<Book>>(bookDao.findById(id));
    }

    @Override
    public Result deleteBook(int id) {
        try {
            bookDao.deleteById(id);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }

    @Override
    public Result updateBook(Book book) {
        try {
            bookDao.save(book);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }
}
