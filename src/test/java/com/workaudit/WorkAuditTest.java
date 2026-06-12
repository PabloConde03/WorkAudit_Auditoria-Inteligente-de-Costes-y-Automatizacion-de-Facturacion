package com.workaudit;

import com.workaudit.composite.*;
import com.workaudit.model.*;
import com.workaudit.state.*;
import com.workaudit.exception.WorkAuditException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class WorkAuditTest {

    @Test
    public void testZeroHoursCost() {
        Developer dev = new Developer("Test Dev", new BigDecimal("50.00"));
        TareaHoja tarea = new TareaHoja("Tarea Cero");
        tarea.addLog(new TimeLog(dev, BigDecimal.ZERO, "Sin trabajo", LocalDate.now()));
        
        assertEquals(BigDecimal.ZERO, tarea.getCoste());
    }

    @Test
    public void testZeroTariffCost() {
        Developer dev = new Developer("Test Dev", BigDecimal.ZERO);
        TareaHoja tarea = new TareaHoja("Tarea Gratis");
        tarea.addLog(new TimeLog(dev, new BigDecimal("10.0"), "Trabajo gratis", LocalDate.now()));
        
        assertEquals(BigDecimal.ZERO, tarea.getCoste());
    }

    @Test
    public void testIllegalStateTransition() {
        Factura factura = new Factura(new BigDecimal("100.00"));
        
        // Avanzar hasta Pagado
        factura.avanzarEstado(); // Borrador -> Aprobado
        factura.avanzarEstado(); // Aprobado -> Pagado
        
        assertEquals("Pagado", factura.getEstadoActual());
        
        // Intentar avanzar más allá de Pagado
        assertThrows(WorkAuditException.class, () -> {
            factura.avanzarEstado();
        });
    }

    @Test
    public void testCompositeSummation() {
        Developer dev = new Developer("Dev", new BigDecimal("10.00"));
        TareaHoja t1 = new TareaHoja("T1");
        t1.addLog(new TimeLog(dev, new BigDecimal("1.0"), "L1", LocalDate.now())); // 10.00
        
        TareaHoja t2 = new TareaHoja("T2");
        t2.addLog(new TimeLog(dev, new BigDecimal("2.0"), "L2", LocalDate.now())); // 20.00
        
        ProyectoCompuesto p = new ProyectoCompuesto("Proj");
        p.addComponent(t1);
        p.addComponent(t2);
        
        assertEquals(new BigDecimal("30.00"), p.getCoste());
    }
}
