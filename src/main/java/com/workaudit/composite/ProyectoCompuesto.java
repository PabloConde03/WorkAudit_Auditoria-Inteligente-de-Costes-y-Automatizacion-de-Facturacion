package com.workaudit.composite;

import java.util.ArrayList;
import java.util.List;

public class ProyectoCompuesto implements ComponenteProyecto {
    private String name;
    private List<ComponenteProyecto> children;

    public ProyectoCompuesto(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addComponent(ComponenteProyecto component) {
        children.add(component);
    }

    @Override
    public double getCoste() {
        return children.stream()
                .mapToDouble(ComponenteProyecto::getCoste)
                .sum();
    }

    @Override
    public String getName() { return name; }
}
