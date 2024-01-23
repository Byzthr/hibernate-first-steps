package com.byzthr.hibernate.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "general")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="brand")
    private String brand;

    @Column(name="model")
    private String model;
    
    @Column(name="version")
    private String version;
    
    @Column(name="from_year")
    private Integer fromYear;
    
    @Column(name="to_year")
    private Integer toYear;
    
    @Column(name="engine_type")
    private String engineType;
    
    @Column(name="motorization")
    private Double motorization;
    
    @Column(name="details")
    private String details;
}
