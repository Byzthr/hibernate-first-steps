package com.byzthr.hibernate.model;

import org.hibernate.annotations.NaturalId;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    @Schema(hidden = true)
    private Long id;

    @NaturalId
    @Column(name="CID")
    @Schema(example = "car ID")
    private String cid;

    @Column(name="brand")
    @Schema(example = "brand")
    private String brand;

    @Column(name="model")
    @Schema(example = "model")
    private String model;
    
    @Column(name="version")
    @Schema(example = "version")
    private String version;
    
    @Column(name="from_year")
    @Schema(example = "1900")
    private Integer fromYear;
    
    @Column(name="to_year")
    @Schema(example = "1900")
    private Integer toYear;

    @Column(name = "engine")
    @Schema(example = "engine name")
    private String engine;
    
    @Enumerated(EnumType.STRING)
    @Column(name="engine_type")
    @Schema(example = "GASOLINE/DIESEL")
    private EngineType engineType;
    
    @Column(name="motorization")
    private Double motorization;
    
    @Column(name="details")
    @Schema(example = "details")
    private String details;
}
