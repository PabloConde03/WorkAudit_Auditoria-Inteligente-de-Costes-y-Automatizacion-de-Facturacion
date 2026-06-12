package com.workaudit;

import com.workaudit.composite.*;
import com.workaudit.model.*;
import com.workaudit.state.*;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("WorkAudit - Sistema de Auditoría de Costes Iniciado");

        // Crear Desarrolladores
        Developer dev1 = new Developer("Juan Pérez", new BigDecimal("50.00"));
        Developer dev2 = new Developer("María García", new BigDecimal("60.00"));

        // Crear Proyecto y Componentes (Composite)
        ProyectoCompuesto proyecto = new ProyectoCompuesto("Proyecto Core");
        ProyectoCompuesto faseBackend = new ProyectoCompuesto("Fase Backend");
        TareaHoja tareaDB = new TareaHoja("Optimización DB");

        tareaDB.addLog(new TimeLog(dev1, new BigDecimal("10.0"), "Diseño de esquemas", LocalDate.now()));
        tareaDB.addLog(new TimeLog(dev2, new BigDecimal("5.0"), "Sintonización de queries", LocalDate.now()));

        faseBackend.addComponent(tareaDB);
        proyecto.addComponent(faseBackend);

        System.out.println("Coste total del proyecto: " + proyecto.getCoste() + "€");

        // Gestión de Facturación (State)
        Factura factura = new Factura(proyecto.getCoste());
        System.out.println("Estado inicial de la factura: " + factura.getEstadoActual());
        
        factura.avanzarEstado();
        System.out.println("Estado tras aprobar: " + factura.getEstadoActual());
        
        factura.avanzarEstado();
        System.out.println("Estado final: " + factura.getEstadoActual());

        try {
            System.out.println("Intentando avanzar una factura pagada...");
            factura.avanzarEstado();
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}
