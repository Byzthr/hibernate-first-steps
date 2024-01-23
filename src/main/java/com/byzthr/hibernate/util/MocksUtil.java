package com.byzthr.hibernate.util;

import org.springframework.lang.NonNull;

import com.byzthr.hibernate.model.Car;

import lombok.experimental.UtilityClass;

@UtilityClass
public class MocksUtil {

    @NonNull
    public static Car megane() {
        Car car = new Car();
        car.setBrand("Renault");
        car.setModel("Megane");
        car.setVersion("I, phase 1");
        car.setFromYear(1999);
        car.setToYear(2002);
        car.setEngineType("gasoline");
        car.setMotorization(1.6);
        car.setDetails("My first owned car");

        return car;
    }
}
