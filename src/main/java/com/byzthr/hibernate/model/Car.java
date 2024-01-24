package com.byzthr.hibernate.model;

import org.hibernate.annotations.NaturalId;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor 
@AllArgsConstructor
@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NaturalId
    @Column(name="CID")
    private String cid;

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
    private EngineType engineType;
    
    @Column(name="motorization")
    private Double motorization;
    
    @Column(name="details")
    private String details;
}
