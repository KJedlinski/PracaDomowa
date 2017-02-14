package com.bootcamp.DAO;

import com.bootcamp.models.Car;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by krystian on 14.02.17.
 */
@Repository
public class CarDaoImpl implements CarDAO {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional
    public void save(Car car) {
        entityManager.persist(car);
    }

    @Override
    @Transactional
    public List<Car> getAll() {
        Query query = entityManager.createQuery("Select c From Car c");
        List<Car> cars = query.getResultList();
        return cars;
    }

    @Override
    public List<Car> findByBrand(String brand) {
        //TODO: Implement searching by brand.
        return null;
    }

    @Override
    public List<Car> findByModel(String model) {
        Query query = entityManager.createQuery("Select c From Car c Where c.model='"+model+"'");
        List<Car> cars = query.getResultList();
        System.err.println(cars.get(0).getId());
        return cars;
    }
}
