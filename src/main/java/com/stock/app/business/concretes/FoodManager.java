package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.FoodService;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.FoodDao;
import com.stock.app.entities.concretes.Food;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodManager implements FoodService {
    @Autowired
    private FoodDao foodDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Food>>(foodDao.findAll());
    }

    @Override
    public Result addFood(Food food) {
        foodDao.save(food);
        return new SuccessResult();
    }

    @Override
    public Result displayFood(int id) {
        return new SuccessDataResult<Optional<Food>>(foodDao.findById(id));
    }

    @Override
    public Result deleteFood(int id) {
        try {
            foodDao.deleteById(id);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }

    @Override
    public Result updateFood(Food food) {
        try {
            foodDao.save(food);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }
}
