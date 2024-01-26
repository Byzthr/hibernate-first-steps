package com.byzthr.hibernate.service;


import java.util.List;

import org.springframework.lang.NonNull;

import com.byzthr.hibernate.model.Car;
import com.byzthr.hibernate.model.CarAttribute;

public interface CarService {

    public Car saveCar(Car car);

    public Car findCarById(@NonNull Long id);

    public List<Car> findAll();

    public String updateCar(Long id, CarAttribute field, String value);

    public String deleteCar(@NonNull Long id);
}
