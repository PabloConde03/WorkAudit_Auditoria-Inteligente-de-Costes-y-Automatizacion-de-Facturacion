package com.workaudit.composite;

import com.workaudit.model.TimeLog;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TareaHoja implements ComponenteProyecto {
    private String name;
    private List<TimeLog> logs;

    public TareaHoja(String name) {
        this.name = name;
        this.logs = new ArrayList<>();
    }

    public void addLog(TimeLog log) {
        logs.add(log);
    }

    @Override
    public BigDecimal getCoste() {
        return logs.stream()
                .map(TimeLog::getCoste)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public String getName() { return name; }
}
