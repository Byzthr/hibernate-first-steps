package com.byzthr.hibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.byzthr.hibernate.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

}
