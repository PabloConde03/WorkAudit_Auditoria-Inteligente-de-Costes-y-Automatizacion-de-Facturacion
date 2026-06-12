package com.workaudit.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class TimeLog {
    private Developer developer;
    private BigDecimal horas;
    private String description;
    private LocalDate date;

    public TimeLog(Developer developer, BigDecimal horas, String description, LocalDate date) {
        this.developer = developer;
        this.horas = horas;
        this.description = description;
        this.date = date;
    }

    public BigDecimal getCoste() {
        return horas.multiply(developer.getTarifa()).setScale(2, RoundingMode.HALF_UP);
    }

    public Developer getDeveloper() { return developer; }
    public BigDecimal getHoras() { return horas; }
    public String getDescription() { return description; }
    public LocalDate getDate() { return date; }
}
