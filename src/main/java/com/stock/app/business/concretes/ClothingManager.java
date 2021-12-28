package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.ClothingService;
import com.stock.app.core.results.ErrorResult;
import com.stock.app.core.results.Result;
import com.stock.app.core.results.SuccessDataResult;
import com.stock.app.core.results.SuccessResult;
import com.stock.app.dataAccess.ClothingDao;
import com.stock.app.entities.concretes.Clothing;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ClothingManager implements ClothingService {

    @Autowired
    private ClothingDao clothingDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Clothing>>(clothingDao.findAll());
    }

    @Override
    public Result addClothing(Clothing clothing) {
        clothingDao.save(clothing);
        return new SuccessResult();
    }

    @Override
    public Result displayClothing(int id) {
        return new SuccessDataResult<Optional<Clothing>>(clothingDao.findById(id));
    }

    @Override
    public Result deleteClothing(int id) {
        try {
            clothingDao.deleteById(id);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }

    @Override
    public Result updateClothing(Clothing clothing) {
        try {
            clothingDao.save(clothing);
            return new SuccessResult();
        }
        catch (Exception e){
            return new ErrorResult();
        }
    }
}
