package com.workaudit.state;

public class EstadoPagado implements EstadoFactura {
    @Override
    public void siguiente(Factura factura) {
        // Estado final
    }

    @Override
    public String getEstado() {
        return "Pagado";
    }
}
