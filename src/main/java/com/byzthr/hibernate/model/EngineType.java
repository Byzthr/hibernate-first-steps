package com.byzthr.hibernate.model;

public enum EngineType {

    //NULL(null),
    GASOLINE("gasoline"),
    DIESEL("diesel");

    public final String value;

    private EngineType(String value) {
        this.value = value;
    }
}
