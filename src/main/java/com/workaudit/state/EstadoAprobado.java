package com.workaudit.state;

public class EstadoAprobado implements EstadoFactura {
    @Override
    public void siguiente(Factura factura) {
        // Lógica de transición a Pagado
        factura.setEstado(new EstadoPagado());
    }

    @Override
    public String getEstado() {
        return "Aprobado";
    }
}
