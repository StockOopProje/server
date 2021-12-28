package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.FurnitureService;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.FurnitureDao;
import com.stock.app.entities.concretes.Furniture;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FurnitureManager implements FurnitureService {
    @Autowired
    private FurnitureDao furnitureDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Furniture>>(furnitureDao.findAll());
    }

    @Override
    public Result addFurniture(Furniture furniture) {
        furnitureDao.save(furniture);
        return new SuccessResult();
    }

    @Override
    public Result displayFurniture(int id) {
        return new SuccessDataResult<Optional<Furniture>>(furnitureDao.findById(id));
    }

    @Override
    public Result deleteFurniture(int id) {
        try {
            furnitureDao.deleteById(id);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }

    @Override
    public Result updateFurniture(Furniture furniture) {
        try {
            furnitureDao.save(furniture);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }
}
