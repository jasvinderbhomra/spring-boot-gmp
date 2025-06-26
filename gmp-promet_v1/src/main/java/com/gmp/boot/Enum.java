package com.gmp.boot;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Enum {
    LOW_COST_RESERVATIONS("Low Cost Reservations"),
    NDC_ORDER("NDC Order");

    private String value;

    private Enum(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }

    @JsonCreator
    public static Enum fromValue(String value) {
        for(Enum b : values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }

        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
