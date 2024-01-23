package com.byzthr.hibernate.service;


import java.util.List;

import org.springframework.lang.NonNull;

import com.byzthr.hibernate.model.Car;

public interface CarService {

    public Car saveCar(@NonNull Car car);

    public Car findCarById(@NonNull Long id);

    public List<Car> findAll();
}
