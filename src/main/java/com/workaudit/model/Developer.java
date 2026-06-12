package com.workaudit.model;

public class Developer {
    private String name;
    private double tarifa;

    public Developer(String name, double tarifa) {
        this.name = name;
        this.tarifa = tarifa;
    }

    public String getName() { return name; }
    public double getTarifa() { return tarifa; }
    public void setTarifa(double tarifa) { this.tarifa = tarifa; }
}
