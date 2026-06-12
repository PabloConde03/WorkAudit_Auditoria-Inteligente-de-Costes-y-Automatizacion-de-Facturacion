package com.workaudit.state;

public class Factura {
    private EstadoFactura estado;
    private double monto;

    public Factura(double monto) {
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

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }
}
