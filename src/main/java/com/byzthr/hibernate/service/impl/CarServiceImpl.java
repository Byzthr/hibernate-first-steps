package com.byzthr.hibernate.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.byzthr.hibernate.model.Car;
import com.byzthr.hibernate.repository.CarRepository;
import com.byzthr.hibernate.service.CarService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository repository;
    
    @Override
    public Car saveCar(Car car) {
        log.debug("saveCar <- {}", car);

        if (car==null) throw new RuntimeException("Entity cannot be null");
        repository.save(car);

        log.debug("saveCar -> {}", car);
        return car;
    }

    @Override
    public Car findCarById(@NonNull Long id) {
        log.debug("findCarById <- {}", id);

        Car car = repository.findById(id).get();

        log.debug("findCarById -> {}", car);
        return car;
    }

    @Override
    public List<Car> findAll() {
        log.debug("findAll <- {}");

        List<Car> cars = StreamSupport
                        .stream(repository.findAll().spliterator(), false)
                        .collect(Collectors.toList());

        log.debug("findAll -> {}", cars);
        return cars;
    }


}
