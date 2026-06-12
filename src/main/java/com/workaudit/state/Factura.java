package com.workaudit.state;

import java.math.BigDecimal;

public class Factura {
    private EstadoFactura estado;
    private BigDecimal monto;

    public Factura(BigDecimal monto) {
        this.monto = monto;
        this.estado = new EstadoBorrador();
    }

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
