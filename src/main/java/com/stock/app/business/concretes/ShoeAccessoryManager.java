package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.ShoeAccessoryService;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.ShoeAccessoryDao;
import com.stock.app.entities.concretes.ShoeAccessory;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ShoeAccessoryManager implements ShoeAccessoryService {
    @Autowired
    private ShoeAccessoryDao shoeAccessoryDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<ShoeAccessory>>(shoeAccessoryDao.findAll());
    }

    @Override
    public Result addShoeAccessory(ShoeAccessory shoeAccessory) {
        shoeAccessoryDao.save(shoeAccessory);
        return new SuccessResult();
    }

    @Override
    public Result displayShoeAccessory(int id) {
        return new SuccessDataResult<Optional<ShoeAccessory>>(shoeAccessoryDao.findById(id));
    }

    @Override
    public Result deleteShoeAccessory(int id) {
        try {
            shoeAccessoryDao.deleteById(id);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }

    @Override
    public Result updateShoeAccessory(ShoeAccessory shoeAccessory) {
        try {
            shoeAccessoryDao.save(shoeAccessory);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }
}
