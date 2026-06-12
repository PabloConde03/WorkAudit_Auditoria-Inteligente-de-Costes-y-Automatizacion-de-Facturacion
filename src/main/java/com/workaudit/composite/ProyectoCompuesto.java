package com.workaudit.composite;

import java.math.BigDecimal;
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
    public BigDecimal getCoste() {
        return children.stream()
                .map(ComponenteProyecto::getCoste)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String getName() { return name; }
}
