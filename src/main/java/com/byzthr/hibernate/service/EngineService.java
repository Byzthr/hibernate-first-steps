package com.byzthr.hibernate.service;


import java.util.List;

import org.springframework.lang.NonNull;

import com.byzthr.hibernate.model.Engine;

public interface EngineService {

    public Engine find(@NonNull Long id);

    public List<Engine> findAll();

    public Engine save(Engine engine);

}
