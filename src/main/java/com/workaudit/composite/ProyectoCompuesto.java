package com.workaudit.composite;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ProyectoCompuesto implements ComponenteProyecto {
    private final UUID id;
    private final String name;
    private final List<ComponenteProyecto> children;

    public ProyectoCompuesto(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addComponent(ComponenteProyecto component) {
        children.add(component);
    }

    public List<ComponenteProyecto> getChildren() {
        return Collections.unmodifiableList(children);
    }

    @Override
    public UUID getId() { return id; }

    @Override
    public BigDecimal getCoste() {
        return children.stream()
                .map(ComponenteProyecto::getCoste)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String getName() { return name; }
}
