package com.workaudit.state;

import com.workaudit.exception.WorkAuditException;

public class EstadoPagado implements EstadoFactura {
    @Override
    public void siguiente(Factura factura) {
        throw new WorkAuditException("La factura ya ha sido pagada y no puede avanzar más estados.");
    }

    @Override
    public String getEstado() {
        return "Pagado";
    }
}
