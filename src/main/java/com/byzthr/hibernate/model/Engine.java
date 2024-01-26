package com.byzthr.hibernate.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "engines")
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(hidden = true)
    private Long id;

    @Schema(example = "model")
    private String model;

    @Schema(example = "version")
    private String version;

    @Schema(example = "maunfacturer")
    private String manufacturer;

    @Enumerated(EnumType.STRING)
    @Schema(example = "GASOLINE/DIESEL")
    private EngineType type;

    private Double displacement;

    private Double stockPower;

    private Double stockTorque;

    private Double bore;

    private Double stroke;

}
