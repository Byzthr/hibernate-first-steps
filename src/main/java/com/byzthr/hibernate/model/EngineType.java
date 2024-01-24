package com.byzthr.hibernate.model;

public enum EngineType {

    GASOLINE("gasoline"),
    DIESEL("diesel");

    public final String value;

    private EngineType(String value) {
        this.value = value;
    }
}
