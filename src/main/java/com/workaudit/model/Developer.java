package com.workaudit.model;

import java.math.BigDecimal;
import java.util.UUID;

public class Developer {
    private final UUID id;
    private final String name;
    private final BigDecimal tarifa;

    public Developer(String name, BigDecimal tarifa) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.tarifa = tarifa;
    }

    public UUID getId() { return id; }
    public String getName() { return name; }
    public BigDecimal getTarifa() { return tarifa; }
}
