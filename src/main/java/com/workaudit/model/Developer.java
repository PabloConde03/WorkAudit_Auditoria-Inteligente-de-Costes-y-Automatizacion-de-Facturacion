package com.workaudit.model;

import java.math.BigDecimal;

public class Developer {
    private String name;
    private BigDecimal tarifa;

    public Developer(String name, BigDecimal tarifa) {
        this.name = name;
        this.tarifa = tarifa;
    }

    public String getName() { return name; }
    public BigDecimal getTarifa() { return tarifa; }
    public void setTarifa(BigDecimal tarifa) { this.tarifa = tarifa; }
}
