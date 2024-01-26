package com.byzthr.hibernate.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.byzthr.hibernate.model.Engine;
import com.byzthr.hibernate.repository.EngineRepository;
import com.byzthr.hibernate.service.EngineService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EngineServiceImpl implements EngineService{
    
    @Autowired
    EngineRepository repository;
    
    @Override
    public Engine find(@NonNull Long id) {
        log.debug("find <- {}", id);

        Engine engine = repository.findById(id).get();

        log.debug("find -> {}", engine);
        return engine;
    }

    @Override
    public List<Engine> findAll() {
        log.debug("findAll <- {}");

        List<Engine> engines = StreamSupport
                        .stream(repository.findAll().spliterator(), false)
                        .collect(Collectors.toList());

        log.debug("findAll -> {}", engines);
        return engines;
    }

    @Override
    public Engine save(Engine engine) {
        log.debug("save <- {}", engine);

        if (engine==null) throw new RuntimeException("Entity cannot be null");
        repository.save(engine);

        log.debug("save -> {}", engine);
        return engine;
    }

}
