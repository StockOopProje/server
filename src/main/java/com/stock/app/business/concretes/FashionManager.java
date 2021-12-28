package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.FashionService;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.FashionDao;
import com.stock.app.entities.concretes.Fashion;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FashionManager implements FashionService {

    @Autowired
    private FashionDao fashionDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Fashion>>(fashionDao.findAll());
    }

    @Override
    public Result addFashion(Fashion fashion) {
        fashionDao.save(fashion);
        return new SuccessResult();
    }

    @Override
    public Result displayFashion(int id) {
        return new SuccessDataResult<Optional<Fashion>>(fashionDao.findById(id));
    }

    @Override
    public Result deleteFashion(int id) {
        try {
            fashionDao.deleteById(id);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }

    @Override
    public Result updateFashion(Fashion fashion) {
        try {
            fashionDao.save(fashion);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }
}
