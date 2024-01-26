package com.byzthr.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.byzthr.hibernate.model.Car;
import com.byzthr.hibernate.model.CarAttribute;
import com.byzthr.hibernate.model.EngineType;
import com.byzthr.hibernate.service.CarService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/cars")
public class HibernateController {

    @Autowired
    private CarService carService;

    @PostMapping("/save")
    public Car saveCar(@NonNull @RequestBody Car car) {
        log.debug("saveCar endpoint triggered");
        return carService.saveCar(car);
    }

    @PostMapping("/saveEasy")
    public Car saveCarEasy(
        @RequestParam(name = "chasisID") String cid,
        @RequestParam(name = "brand") String brand,
        @RequestParam(name = "model") String model,
        @RequestParam(name = "version", required = false) String version,
        @RequestParam(name = "from year", required = false) Integer fromYear,
        @RequestParam(name = "to year", required = false) Integer toYear,
        @RequestParam(name = "engine", required = false) String engine,
        @RequestParam(name = "motorization", required = false) Double motorization,
        @RequestParam(name = "engine type", required = false) EngineType engineType,
        @RequestBody(required = false) String details
        ) {
        log.debug("saveCarEasy endpoint triggered");
        return carService.saveCar(Car.builder()
        .cid(cid)
        .brand(brand)
        .model(model)
        .version(version)
        .fromYear(fromYear)
        .toYear(toYear)
        .engine(engine)
        .motorization(motorization)
        .engineType(engineType)
        .details(details)
        .build());
    }

    @GetMapping("/findAll")
    public List<Car> getAllCars() {
        log.debug("saveCar endpoint triggered");
        return carService.findAll();
    }

    @PutMapping("/updateField")
    public <T> String updateCarField(
        @RequestParam("id") Long id,
        @RequestParam("field") CarAttribute field,
        @RequestParam("value") String value
        ) {
            log.debug("updateCarField endpoint triggered");
            return carService.updateCar(id, field, value);
    }

    @DeleteMapping("/delete")
    public String deleteCar(@NonNull @RequestParam("id") Long id) {
        log.debug("deleteCar endpoint triggered");
        return carService.deleteCar(id);
    }
}
