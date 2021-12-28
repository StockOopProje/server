package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.ElectronicService;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.ElectronicDao;
import com.stock.app.entities.concretes.Electronic;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ElectronicManager implements ElectronicService {

    @Autowired
    private ElectronicDao electronicDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Electronic>>(electronicDao.findAll());
    }

    @Override
    public Result addElectronic(Electronic electronic) {
        electronicDao.save(electronic);
        return new SuccessResult();
    }

    @Override
    public Result displayElectronic(int id) {
        return new SuccessDataResult<Optional<Electronic>>(electronicDao.findById(id));
    }

    @Override
    public Result deleteElectronic(int id) {
        try {
            electronicDao.deleteById(id);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }

    @Override
    public Result updateElectronic(Electronic electronic) {
        try {
            electronicDao.save(electronic);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }
}
