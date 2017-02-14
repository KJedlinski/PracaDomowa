package com.bootcamp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by krystian on 14.02.17.
 */
@Entity
public class Car {

    @Id
    @GeneratedValue
    private long id;

    private String brand;
    private String model;
    private int dateOfProduction;
    private long engineCapacity;
    private int enginePower;
    private long price;

    public Car(){

    }

    public Car(long id, String brand, String model, int dateOfProduction, long engineCapacity, int enginePower, long price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.dateOfProduction = dateOfProduction;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public long getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(long engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
}
