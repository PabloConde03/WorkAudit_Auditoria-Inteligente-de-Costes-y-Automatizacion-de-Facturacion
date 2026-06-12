package com.workaudit.state;

public interface EstadoFactura {
    void siguiente(Factura factura);
    String getEstado();
}
