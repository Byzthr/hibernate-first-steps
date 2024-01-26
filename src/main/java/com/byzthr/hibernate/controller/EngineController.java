package com.byzthr.hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.byzthr.hibernate.model.Engine;
import com.byzthr.hibernate.service.EngineService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/engines")
public class EngineController {

    @Autowired
    private EngineService engineService;

    @GetMapping("/find")
    public Engine findEngine(@NonNull @RequestParam Long id) {
        log.debug("findEngine endopoint triggered");
        return engineService.find(id);
    }

    @GetMapping("/findAll")
    public List<Engine> findAllEngines() {
        log.debug("findAllEngines endopoint triggered");
        return engineService.findAll();
    }

    @PostMapping("/save")
    public Engine saveEngine(@RequestBody Engine engine) {
        log.debug("findAllEngines endopoint triggered");
        return engineService.save(engine);
    }

}
