package com.workaudit.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.UUID;

public record TimeLog(UUID id, Developer developer, BigDecimal horas, String description, LocalDate date) {
    public TimeLog(Developer developer, BigDecimal horas, String description, LocalDate date) {
        this(UUID.randomUUID(), developer, horas, description, date);
    }

    public BigDecimal getCoste() {
        return horas.multiply(developer.getTarifa()).setScale(2, RoundingMode.HALF_UP);
    }
}
