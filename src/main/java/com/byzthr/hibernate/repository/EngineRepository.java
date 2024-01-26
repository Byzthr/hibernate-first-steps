package com.byzthr.hibernate.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.byzthr.hibernate.model.Engine;

@Repository
public interface EngineRepository extends CrudRepository<Engine, Long> {

}
