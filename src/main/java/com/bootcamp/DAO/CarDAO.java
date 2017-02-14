package com.bootcamp.DAO;

import com.bootcamp.models.Car;
import org.springframework.stereotype.Component;

import javax.validation.constraints.AssertFalse;
import java.util.List;

/**
 * Created by krystian on 14.02.17.
 */

public interface CarDAO {
    void save(Car car);
    List<Car> getAll();
    List<Car> findByBrand(String brand);
    List<Car> findByModel(String model);
}
