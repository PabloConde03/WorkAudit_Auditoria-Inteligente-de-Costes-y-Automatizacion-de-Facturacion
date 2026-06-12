package com.workaudit.model;

import java.time.LocalDate;

public class TimeLog {
    private Developer developer;
    private double horas;
    private String description;
    private LocalDate date;

    public TimeLog(Developer developer, double horas, String description, LocalDate date) {
        this.developer = developer;
        this.horas = horas;
        this.description = description;
        this.date = date;
    }

    public Developer getDeveloper() { return developer; }
    public double getHoras() { return horas; }
    public String getDescription() { return description; }
    public LocalDate getDate() { return date; }
}
