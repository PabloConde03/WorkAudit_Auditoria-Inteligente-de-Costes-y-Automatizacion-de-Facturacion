package com.workaudit.composite;

import com.workaudit.model.TimeLog;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class TareaHoja implements ComponenteProyecto {
    private final UUID id;
    private final String name;
    private final List<TimeLog> logs;

    public TareaHoja(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.logs = new ArrayList<>();
    }

    public void addLog(TimeLog log) {
        logs.add(log);
    }

    @Override
    public UUID getId() { return id; }

    @Override
    public BigDecimal getCoste() {
        return logs.stream()
                .map(TimeLog::getCoste)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String getName() { return name; }
}
