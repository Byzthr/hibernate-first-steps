package com.byzthr.hibernate.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.byzthr.hibernate.model.Car;

import jakarta.transaction.Transactional;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {

    @Modifying
    @Transactional
    @Query(value = "update cars set cid=:value where id=:id", nativeQuery = true)
    public void updateCid(
        @Param(value = "id") Long ID,
        @Param(value = "value") String value
        );

    @Modifying
    @Transactional
    @Query(value = "update cars set brand=:value where id=:id", nativeQuery = true)
    public void updateBrand(
        @Param(value = "id") Long ID,
        @Param(value = "value") String value
        );

    @Modifying
    @Transactional
    @Query(value = "update cars set model=:value where id=:id", nativeQuery = true)
    public void updateModel(
        @Param(value = "id") Long ID,
        @Param(value = "value") String value
        );

    @Modifying
    @Transactional
    @Query(value = "update cars set version=:value where id=:id", nativeQuery = true)
    public void updateVersion(
        @Param(value = "id") Long ID,
        @Param(value = "value") String value
        );

    @Modifying
    @Transactional
    @Query(value = "update cars set from_year=:value where id=:id", nativeQuery = true)
    public void updateFromYear(
        @Param(value = "id") Long ID,
        @Param(value = "value") Integer value
        );

    @Modifying
    @Transactional
    @Query(value = "update cars set to_year=:value where id=:id", nativeQuery = true)
    public void updateToYear(
        @Param(value = "id") Long ID,
        @Param(value = "value") Integer value
        );

    @Modifying
    @Transactional
    @Query(value = "update cars set engine=:value where id=:id", nativeQuery = true)
    public void updateEngine(
        @Param(value = "id") Long ID,
        @Param(value = "value") String value
        );

    @Modifying
    @Transactional
    @Query(value = "update cars set engine_type=:value where id=:id", nativeQuery = true)
    public void updateEngineType(
        @Param(value = "id") Long ID,
        @Param(value = "value") String value
        );

    @Modifying
    @Transactional
    @Query(value = "update cars set motorization=:value where id=:id", nativeQuery = true)
    public void updateMotorization(
        @Param(value = "id") Long ID,
        @Param(value = "value") Double value
        );

    @Modifying
    @Transactional
    @Query(value = "update cars set details=:value where id=:id", nativeQuery = true)
    public void updateDetails(
        @Param(value = "id") Long ID,
        @Param(value = "value") String value
        );

}
