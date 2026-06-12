# WorkAudit - Auditoría Inteligente de Costes y Automatización de Facturación

WorkAudit es una plataforma de ingeniería de software diseñada para optimizar la gestión financiera de proyectos tecnológicos. El sistema elimina las fugas de ingresos mediante la auditoría recursiva de costes en tiempo real y un motor de estados robusto para el ciclo de vida de la facturación.

## 🚀 Características Principales

- **Cálculo de Costes Recursivo**: Implementación del patrón estructural **Composite** para modelar proyectos complejos como árboles dinámicos de granularidad fina (Fases, Subfases y Entregables).
- **Eliminación de Fugas Silenciosas**: Auditoría automática en tiempo real que compara el presupuesto manual frente a la agregación jerárquica de horas reales trabajadas.
- **Motor de Estados de Facturación**: Control estricto del ciclo de vida de las facturas basado en el patrón **State**, asegurando logs e hitos inmutables antes de cualquier liquidación.
- **Arquitectura Escalable**: Código desacoplado diseñado bajo principios **SOLID**, combinando patrones estructurales y de comportamiento (Composite, State, Observer).

## 📐 Modelo Matemático y Control

Cada componente del proyecto calcula de forma autónoma su coste acumulado basándose en el estado de sus nodos hijos en tiempo real.

**Fórmula de Sumatoria Recursiva:**
$$C = \sum (H \times T)$$

Donde:
- $C$: Coste total acumulado.
- $H$: Horas de desarrollo auditadas.
- $T$: Tarifa/tasa unitaria asignada al recurso.

## 🗂️ Estructura del Proyecto

El sistema organiza los flujos financieros mediante una jerarquía dinámica:

```text
└── 📂 Proyecto Core (Suma total acumulada)
    ├── 📂 Fase Backend
    │   └── 📄 </> Optimización DB (Horas × Tarifa)
    └── 📂 Fase Frontend
        └── 📄 Componentes de UI (Horas × Tarifa)
```

## ⚙️ Ciclo de Vida de Facturación

El motor de estados garantiza que ninguna factura sea liquidada sin superar las reglas de auditoría:

1. **Borrador**: Carga automática de horas acumuladas desde la jerarquía del proyecto.
2. **Aprobado**: Validación del sistema tras superar las reglas de auditoría de costes.
3. **Pagado**: Conciliación final del pago y generación de reportes de rentabilidad.

## 🛠️ Instalación y Configuración

### Prerrequisitos
- **Java JDK 17** o superior.
- **Apache Maven 3.8+**.

### Pasos de Instalación
1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/PabloConde03/WorkAudit_Auditoria-Inteligente-de-Costes-y-Automatizacion-de-Facturacion.git
   cd WorkAudit
   ```

2. **Compilar y ejecutar pruebas**:
   ```bash
   mvn clean test
   ```

## 📈 Impacto Operativo

- **Reducción de errores**: Hasta un 95% en la facturación y conciliación de horas.
- **Trazabilidad absoluta**: Vinculación directa de cada coste a la jerarquía del proyecto.
- **Transparencia**: Auditoría 100% automatizada y en tiempo real.

---
*"Saber exactamente en qué se ha invertido cada segundo es la base para construir software de manera rentable."* — **Filosofía WorkAudit**
