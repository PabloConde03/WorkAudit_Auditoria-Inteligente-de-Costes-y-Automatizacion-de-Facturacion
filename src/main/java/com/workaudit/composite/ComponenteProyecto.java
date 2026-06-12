package com.workaudit.composite;

import java.math.BigDecimal;
import java.util.UUID;

public interface ComponenteProyecto {
    UUID getId();
    BigDecimal getCoste();
    String getName();
}
