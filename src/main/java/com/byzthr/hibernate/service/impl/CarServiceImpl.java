package com.byzthr.hibernate.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.byzthr.hibernate.model.Car;
import com.byzthr.hibernate.model.CarAttribute;
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

    public String updateCar(Long id, CarAttribute field, String value) {
        log.debug("updateCar <- id:{}, field {} to {}", id, field, value);

        switch (field) {
            case CID:
                repository.updateCid(id, value);
                break;
            case BRAND:
                repository.updateBrand(id, value);
                break;
            case MODEL:
                repository.updateModel(id, value);
                break;
            case VERSION:
                repository.updateVersion(id, value);
                break;
            case FROM_YEAR:
                repository.updateFromYear(id, Integer.parseInt(value));
                break;
            case TO_YEAR:
                repository.updateToYear(id, Integer.parseInt(value));
                break;
            case ENGINE:
                repository.updateEngine(id, value);
                break;
            case ENGINE_TYPE:
                repository.updateEngineType(id, value);
                break;
            case MOTORIZATION:
                repository.updateMotorization(id, Double.parseDouble(value));
                break;
            case DETAILS:
                repository.updateDetails(id, value);
                break;
        
            default:
                break;
        }

        log.debug("updateCar -> OK");
        return "OK";
    }

}
