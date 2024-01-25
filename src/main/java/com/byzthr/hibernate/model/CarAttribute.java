package com.byzthr.hibernate.model;

public enum CarAttribute {

    CID("cid"),
    BRAND("brand"),
    MODEL("model"),
    VERSION("version"),
    FROM_YEAR("from_year"),
    TO_YEAR("to_year"),
    ENGINE("engine"),
    ENGINE_TYPE("engine_type"),
    MOTORIZATION("motorization"),
    DETAILS("details");

    public final String stringValue;

    private CarAttribute(String value) {
        this.stringValue = value;
    }

}
