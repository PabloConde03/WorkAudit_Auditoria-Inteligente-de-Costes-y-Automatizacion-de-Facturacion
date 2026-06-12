package com.workaudit.state;

public class EstadoBorrador implements EstadoFactura {
    @Override
    public void siguiente(Factura factura) {
        // Lógica de transición a Aprobado
        factura.setEstado(new EstadoAprobado());
    }

    @Override
    public String getEstado() {
        return "Borrador";
    }
}
