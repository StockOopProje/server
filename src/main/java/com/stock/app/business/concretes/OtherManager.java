package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.OtherService;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.OtherDao;
import com.stock.app.entities.concretes.Other;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OtherManager implements OtherService {
    @Autowired
    private OtherDao otherDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Other>>(otherDao.findAll());
    }

    @Override
    public Result addOther(Other other) {
        otherDao.save(other);
        return new SuccessResult();
    }

    @Override
    public Result displayOther(int id) {
        return new SuccessDataResult<Optional<Other>>(otherDao.findById(id));
    }

    @Override
    public Result deleteOther(int id) {
        try {
            otherDao.deleteById(id);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }

    @Override
    public Result updateOther(Other other) {
        try {
            otherDao.save(other);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }
}
