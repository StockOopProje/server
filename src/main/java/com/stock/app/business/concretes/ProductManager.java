package com.stock.app.business.concretes;

import com.stock.app.business.abstracts.ProductService;
import com.stock.app.core.results.*;
import com.stock.app.dataAccess.*;
import com.stock.app.entities.concretes.*;
import com.stock.app.entities.dtos.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductManager implements ProductService {

    @Autowired
    private ProductDao productDao;
    @Autowired
    private FashionDao fashionDao;
    @Autowired
    private BookDao bookDao;
    @Autowired
    private ElectronicDao electronicDao;
    @Autowired
    private ClothingDao clothingDao;
    @Autowired
    private ShoeAccessoryDao shoeAccessoryDao;
    @Autowired
    private OtherDao otherDao;
    @Autowired
    private FurnitureDao furnitureDao;
    @Autowired
    private FoodDao foodDao;

    @Override
    public Result getAll() {
        return new SuccessDataResult<List<Product>>(productDao.findAll());
    }


    @Override
    public Result isEnoughStock(int id) {
        try{
            Product product = productDao.getById(id);
            if(product.getMin_quantity() > product.getStock_quantity()){
                return new ErrorResult();
            }
        }
        catch (Exception e){
            return new ErrorResult();
        }

        return new SuccessResult();
    }

    @Override
    public Result addProduct(ProductDto product) {
        String type = product.getProduct_type();

        if(type.equals("Food")){
            Food food = new Food();
            food.setProduct_type("Food");
            food.setName(product.getName());
            food.setMin_quantity(product.getMin_quantity());
            food.setStock_quantity(product.getStock_quantity());
            food.setBarcode(product.getBarcode());
            food.setDescription(product.getDescription());
            food.setExpiration_date(product.getExpiration_date());
            food.setUnit(product.getUnit());
            food.setProduction_date(product.getProduction_date());
            food.setQuantity(product.getQuantity());
            foodDao.save(food);
            return new SuccessDataResult<Food>(food);
        }
        else if(type.equals("Fashion")){
            Fashion fashion = new Fashion();
            fashion.setProduct_type("Fashion");
            fashion.setName(product.getName());
            fashion.setMin_quantity(product.getMin_quantity());
            fashion.setStock_quantity(product.getStock_quantity());
            fashion.setBarcode(product.getBarcode());
            fashion.setDescription(product.getDescription());
            fashion.setGender(product.getGender());
            fashion.setType(product.getType());
            fashion.setSize(product.getSize());
            fashionDao.save(fashion);
            return new SuccessDataResult<Fashion>(fashion);
        }
        else if(type.equals("Book")){
            Book book = new Book();
            book.setProduct_type("Book");
            book.setName(product.getName());
            book.setMin_quantity(product.getMin_quantity());
            book.setStock_quantity(product.getStock_quantity());
            book.setBarcode(product.getBarcode());
            book.setDescription(product.getDescription());
            book.setPages(product.getPages());
            book.setAuthor(product.getAuthor());
            book.setGenre(product.getGenre());
            bookDao.save(book);
            return new SuccessDataResult<Book>(book);
        }
        else if(type.equals("Electronic")){
            Electronic electronic = new Electronic();
            electronic.setProduct_type("Electronic");
            electronic.setName(product.getName());
            electronic.setMin_quantity(product.getMin_quantity());
            electronic.setStock_quantity(product.getStock_quantity());
            electronic.setBarcode(product.getBarcode());
            electronic.setDescription(product.getDescription());
            electronic.setWarranty(product.getWarranty());
            electronic.setArea_of_usage(product.getArea_of_usage());
            electronic.setType(product.getType());
            electronicDao.save(electronic);
            return new SuccessDataResult<Electronic>(electronic);
        }
        else if(type.equals("Clothing")){
            Clothing clothing = new Clothing();
            clothing.setProduct_type("Clothing");
            clothing.setName(product.getName());
            clothing.setMin_quantity(product.getMin_quantity());
            clothing.setStock_quantity(product.getStock_quantity());
            clothing.setBarcode(product.getBarcode());
            clothing.setDescription(product.getDescription());
            clothing.setFabric_type(product.getFabric_type());
            clothingDao.save(clothing);
            return new SuccessDataResult<Clothing>(clothing);
        }
        else if(type.equals("ShoeAccessory")){
            ShoeAccessory shoeAccessory = new ShoeAccessory();
            shoeAccessory.setProduct_type("ShoeAccessory");
            shoeAccessory.setName(product.getName());
            shoeAccessory.setMin_quantity(product.getMin_quantity());
            shoeAccessory.setStock_quantity(product.getStock_quantity());
            shoeAccessory.setBarcode(product.getBarcode());
            shoeAccessory.setDescription(product.getDescription());
            shoeAccessoryDao.save(shoeAccessory);
            return new SuccessDataResult<ShoeAccessory>(shoeAccessory);
        }
        else if(type.equals("Other")){
            Other other = new Other();
            other.setProduct_type("Other");
            other.setName(product.getName());
            other.setMin_quantity(product.getMin_quantity());
            other.setStock_quantity(product.getStock_quantity());
            other.setBarcode(product.getBarcode());
            other.setDescription(product.getDescription());
            otherDao.save(other);
            return new SuccessDataResult<Other>(other);
        }
        else if(type.equals("Furniture")){
            Furniture furniture = new Furniture();
            furniture.setProduct_type("Furniture");
            furniture.setName(product.getName());
            furniture.setMin_quantity(product.getMin_quantity());
            furniture.setStock_quantity(product.getStock_quantity());
            furniture.setBarcode(product.getBarcode());
            furniture.setDescription(product.getDescription());
            furniture.setConcept(product.getConcept());
            furniture.setWarranty(product.getWarranty());
            furniture.setUnit(product.getUnit());
            furniture.setWeight(product.getWeight());
            furnitureDao.save(furniture);
            return new SuccessDataResult<Furniture>(furniture);
        }
        Product pr = new Product(
                0,
                product.getProduct_type(),
                product.getName(),
                product.getMin_quantity(),
                product.getStock_quantity(),
                product.getBarcode(),
                product.getDescription()
        );
        productDao.save(pr);
        return new SuccessDataResult<Product>(pr);

    }

    @Override
    public Result displayProduct(int id) {
        Product product = productDao.getById(id);
        String type = product.getProduct_type();

        if(type.equals("Food")){
            return new SuccessDataResult<Food>(foodDao.getById(id));
        }
        else if(type.equals("Fashion")){
            return new SuccessDataResult<Fashion>(fashionDao.getById(id));
        }
        else if(type.equals("Book")){
            return new SuccessDataResult<Book>(bookDao.getById(id));
        }
        else if(type.equals("Electronic")){
            return new SuccessDataResult<Electronic>(electronicDao.getById(id));
        }
        else if(type.equals("Clothing")){
            return new SuccessDataResult<Clothing>(clothingDao.getById(id));
        }
        else if(type.equals("ShoeAccessory")){
            return new SuccessDataResult<ShoeAccessory>(shoeAccessoryDao.getById(id));
        }
        else if(type.equals("Other")){
            return new SuccessDataResult<Other>(otherDao.getById(id));
        }
        else if(type.equals("Furniture")){
            return new SuccessDataResult<Furniture>(furnitureDao.getById(id));
        }

        return new SuccessDataResult<Product>(product);

    }

    @Override
    public Result deleteProduct(int id) {
        Product product = productDao.getById(id);
        String type = product.getProduct_type();

        if(type.equals("Food")){
            foodDao.deleteById(id);
            return new SuccessResult();
        }
        else if(type.equals("Fashion")){
            fashionDao.deleteById(id);
            return new SuccessResult();
        }
        else if(type.equals("Book")){
            bookDao.deleteById(id);
            return new SuccessResult();
        }
        else if(type.equals("Electronic")){
            electronicDao.deleteById(id);
            return new SuccessResult();
        }
        else if(type.equals("Clothing")){
            clothingDao.deleteById(id);
            return new SuccessResult();
        }
        else if(type.equals("ShoeAccessory")){
            shoeAccessoryDao.deleteById(id);
            return new SuccessResult();
        }
        else if(type.equals("Other")){
            otherDao.deleteById(id);
            return new SuccessResult();
        }
        else if(type.equals("Furniture")){
            furnitureDao.deleteById(id);
            return new SuccessResult();
        }

        productDao.deleteById(id);
        return new SuccessResult();
    }

    @Override
    public Result updateProduct(ProductDto product) {
        String type = product.getProduct_type();

        if(type.equals("Food")){
            Food food = new Food();
            food.setId(product.getId());
            food.setProduct_type("Food");
            food.setName(product.getName());
            food.setMin_quantity(product.getMin_quantity());
            food.setStock_quantity(product.getStock_quantity());
            food.setBarcode(product.getBarcode());
            food.setDescription(product.getDescription());
            food.setExpiration_date(product.getExpiration_date());
            food.setUnit(product.getUnit());
            food.setProduction_date(product.getProduction_date());
            food.setQuantity(product.getQuantity());
            foodDao.save(food);
            return new SuccessDataResult<Food>(food);
        }
        else if(type.equals("Fashion")){
            Fashion fashion = new Fashion();
            fashion.setId(product.getId());
            fashion.setProduct_type("Fashion");
            fashion.setName(product.getName());
            fashion.setMin_quantity(product.getMin_quantity());
            fashion.setStock_quantity(product.getStock_quantity());
            fashion.setBarcode(product.getBarcode());
            fashion.setDescription(product.getDescription());
            fashion.setGender(product.getGender());
            fashion.setType(product.getType());
            fashion.setSize(product.getSize());
            fashionDao.save(fashion);
            return new SuccessDataResult<Fashion>(fashion);
        }
        else if(type.equals("Book")){
            Book book = new Book();
            book.setId(product.getId());
            book.setProduct_type("Book");
            book.setName(product.getName());
            book.setMin_quantity(product.getMin_quantity());
            book.setStock_quantity(product.getStock_quantity());
            book.setBarcode(product.getBarcode());
            book.setDescription(product.getDescription());
            book.setPages(product.getPages());
            book.setAuthor(product.getAuthor());
            book.setGenre(product.getGenre());
            bookDao.save(book);
            return new SuccessDataResult<Book>(book);
        }
        else if(type.equals("Electronic")){
            Electronic electronic = new Electronic();
            electronic.setId(product.getId());
            electronic.setProduct_type("Electronic");
            electronic.setName(product.getName());
            electronic.setMin_quantity(product.getMin_quantity());
            electronic.setStock_quantity(product.getStock_quantity());
            electronic.setBarcode(product.getBarcode());
            electronic.setDescription(product.getDescription());
            electronic.setWarranty(product.getWarranty());
            electronic.setArea_of_usage(product.getArea_of_usage());
            electronic.setType(product.getType());
            electronicDao.save(electronic);
            return new SuccessDataResult<Electronic>(electronic);
        }
        else if(type.equals("Clothing")){
            Clothing clothing = new Clothing();
            clothing.setId(product.getId());
            clothing.setProduct_type("Clothing");
            clothing.setName(product.getName());
            clothing.setMin_quantity(product.getMin_quantity());
            clothing.setStock_quantity(product.getStock_quantity());
            clothing.setBarcode(product.getBarcode());
            clothing.setDescription(product.getDescription());
            clothing.setFabric_type(product.getFabric_type());
            clothingDao.save(clothing);
            return new SuccessDataResult<Clothing>(clothing);
        }
        else if(type.equals("ShoeAccessory")){
            ShoeAccessory shoeAccessory = new ShoeAccessory();
            shoeAccessory.setId(product.getId());
            shoeAccessory.setProduct_type("ShoeAccessory");
            shoeAccessory.setName(product.getName());
            shoeAccessory.setMin_quantity(product.getMin_quantity());
            shoeAccessory.setStock_quantity(product.getStock_quantity());
            shoeAccessory.setBarcode(product.getBarcode());
            shoeAccessory.setDescription(product.getDescription());
            shoeAccessoryDao.save(shoeAccessory);
            return new SuccessDataResult<ShoeAccessory>(shoeAccessory);
        }
        else if(type.equals("Other")){
            Other other = new Other();
            other.setId(product.getId());
            other.setProduct_type("Other");
            other.setName(product.getName());
            other.setMin_quantity(product.getMin_quantity());
            other.setStock_quantity(product.getStock_quantity());
            other.setBarcode(product.getBarcode());
            other.setDescription(product.getDescription());
            otherDao.save(other);
            return new SuccessDataResult<Other>(other);
        }
        else if(type.equals("Furniture")){
            Furniture furniture = new Furniture();
            furniture.setId(product.getId());
            furniture.setProduct_type("Furniture");
            furniture.setName(product.getName());
            furniture.setMin_quantity(product.getMin_quantity());
            furniture.setStock_quantity(product.getStock_quantity());
            furniture.setBarcode(product.getBarcode());
            furniture.setDescription(product.getDescription());
            furniture.setConcept(product.getConcept());
            furniture.setWarranty(product.getWarranty());
            furniture.setUnit(product.getUnit());
            furniture.setWeight(product.getWeight());
            furnitureDao.save(furniture);
            return new SuccessDataResult<Furniture>(furniture);
        }
        Product pr = new Product(
                product.getId(),
                product.getProduct_type(),
                product.getName(),
                product.getMin_quantity(),
                product.getStock_quantity(),
                product.getBarcode(),
                product.getDescription()
        );
        productDao.save(pr);
        return new SuccessDataResult<Product>(pr);
    }


}
