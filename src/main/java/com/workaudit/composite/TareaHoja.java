package com.workaudit.composite;

import com.workaudit.model.TimeLog;
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
    public double getCoste() {
        return logs.stream()
                .mapToDouble(log -> log.getHoras() * log.getDeveloper().getTarifa())
                .sum();
    }

    @Override
    public String getName() { return name; }
}
