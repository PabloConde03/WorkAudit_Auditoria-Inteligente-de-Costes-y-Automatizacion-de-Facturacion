package com.workaudit.state;

import com.workaudit.exception.WorkAuditException;

public class EstadoAprobado implements EstadoFactura {
    @Override
    public void siguiente(Factura factura) {
        factura.setEstado(new EstadoPagado());
    }

    @Override
    public String getEstado() {
        return "Aprobado";
    }
}
