package com.byzthr.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byzthr.hibernate.model.Car;
import com.byzthr.hibernate.service.CarService;
import com.byzthr.hibernate.util.MocksUtil;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/cars")
@RestController
public class HibernateController {

    @Autowired
    private CarService carService;

    @GetMapping("/saveMegane")
    public Car saveMegane() {
        log.debug("saveMegane <- {}");

        carService.saveCar(MocksUtil.megane());

        log.debug("saveMegane -> {}");
        return MocksUtil.megane();
    }

    @PostMapping("/save")
    public Car saveCar(@NonNull @RequestBody Car car) {
        log.debug("saveCar <- {}", car);

        carService.saveCar(car);

        log.debug("saveCar -> {}", car);
        return car;
    }

    @GetMapping("/findAll")
    public List<Car> getAllCars() {
        log.debug("saveCar <- {}");

        List<Car> cars = carService.findAll();

        log.debug("saveCar -> {}", cars);
        return cars;
    }
}
