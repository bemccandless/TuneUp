package com.bem.development.tuneup.vehicle;

import org.springframework.data.annotation.Id;

/**
 * Holds all the information for a vehicle.
 * 
 * @author bemccandless
 */
public class Vehicle {

    @Id
    private String id;
    private String driver;
    private String make;
    private String model;
    private Integer year;
    private Integer mileage;

    public Vehicle() {
    }

    public Vehicle(String driver, String make, String model, Integer year, Integer mileage) {
        this.driver = driver;
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }


    
}
