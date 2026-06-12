package com.workaudit.state;

import java.math.BigDecimal;
import java.util.UUID;

public class Factura {
    private final UUID id;
    private EstadoFactura estado;
    private BigDecimal monto;

    public Factura(BigDecimal monto) {
        this.id = UUID.randomUUID();
        this.monto = monto;
        this.estado = new EstadoBorrador();
    }

    public UUID getId() { return id; }

    public void avanzarEstado() {
        estado.siguiente(this);
    }

    public void setEstado(EstadoFactura estado) {
        this.estado = estado;
    }

    public String getEstadoActual() {
        return estado.getEstado();
    }

    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }
}
