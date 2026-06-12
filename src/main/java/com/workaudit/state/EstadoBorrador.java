package com.workaudit.state;

import com.workaudit.exception.WorkAuditException;

public class EstadoBorrador implements EstadoFactura {
    @Override
    public void siguiente(Factura factura) {
        factura.setEstado(new EstadoAprobado());
    }

    @Override
    public String getEstado() {
        return "Borrador";
    }
}
