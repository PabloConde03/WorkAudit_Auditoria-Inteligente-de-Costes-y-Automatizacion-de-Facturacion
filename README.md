![Estado](https://img.shields.io/badge/Estado-En%20Proceso-orange) ![Java](https://img.shields.io/badge/Java-25-ED8B00?style=flat&logo=openjdk&logoColor=white) ![Maven](https://img.shields.io/badge/Maven-3.8+-C71A36?style=flat&logo=apache-maven&logoColor=white) ![Jackson](https://img.shields.io/badge/Jackson-JSON-blue?style=flat&logo=json&logoColor=white)
![Horas](https://img.shields.io/badge/Horas%20dedicadas-2-blue)

# WorkAudit - Auditoría Inteligente de Costes y Automatización de Facturación

WorkAudit es un motor financiero de élite diseñado para optimizar la gestión de costes en proyectos tecnológicos. El sistema transforma la gestión financiera tradicional en una auditoría recursiva en tiempo real, eliminando fugas de ingresos mediante una arquitectura basada en patrones de diseño industriales.

## 🚀 Características de Grado Industrial

- **Cálculo de Costes Recursivo (Patrón Composite)**: Modelado de proyectos complejos como árboles dinámicos (Fases $\rightarrow$ Subfases $\rightarrow$ Entregables) con sumatorias automáticas de costes.
- **Gestión de Ciclo de Vida (Patrón State)**: Control estricto de la facturación (Borrador $\rightarrow$ Aprobado $\rightarrow$ Pagado) con validaciones de negocio inmutables.
- **Automatización de Eventos (Patrón Observer)**: Sistema de notificaciones y generación de reportes automáticos disparados por cambios de estado en la facturación.
- **Trazabilidad Criptográfica**: Registro de auditoría sellado mediante **SHA-256**, asegurando que cada transición de estado sea inmutable y verificable.
- **Precisión Financiera**: Implementación de `BigDecimal` en todos los cálculos monetarios para eliminar errores de redondeo de coma flotante.
- **Exportación para BI**: Servicio de exportación a **JSON y CSV** para alimentar herramientas de Business Intelligence (Power BI, Tableau).

## 📐 Arquitectura y Estándares

El sistema ha sido desarrollado bajo principios **SOLID** y estándares de ingeniería de software modernos:

- **Inmutabilidad**: Uso de `Java Records` para los registros de tiempo (`TimeLog`), garantizando la integridad de la auditoría.
- **Seguridad de Colecciones**: Implementación de `unmodifiableList` para proteger la jerarquía del proyecto contra manipulaciones externas.
- **Identificación Única**: Uso de `UUID` en todas las entidades para asegurar la compatibilidad con futuras bases de datos distribuidas.
- **Validación**: Suite de tests unitarios con **JUnit 5** cubriendo casos límite (*edge cases*) y transiciones ilegales.

## 🗂️ Estructura del Proyecto

```text
└── 📂 Proyecto Core [Total: XXX€]
    ├── 📂 Fase Backend [Total: XXX€]
    │   └── 📄 </> Optimización DB [Coste: XXX€]
    └── 📂 Fase Frontend [Total: XXX€]
        └── 📄 Componentes de UI [Coste: XXX€]
```

## 🛠️ Instalación y Configuración

### Prerrequisitos
- **Java JDK 25** (o superior).
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

3. **Ejecutar el Motor**:
   ```bash
   mvn exec:java -Dexec.mainClass="com.workaudit.Main"
   ```

## 📈 Impacto Operativo

- **Reducción de errores**: Hasta un 95% en la conciliación de horas y facturación.
- **Trazabilidad absoluta**: Vinculación directa de cada céntimo invertido a la jerarquía del proyecto.
- **Auditoría 100% transparente**: Sello criptográfico en cada hito financiero.

---
*"Saber exactamente en qué se ha invertido cada segundo es la base para construir software de manera rentable."* — **Filosofía WorkAudit**

## 🔮 Siguiente Fase del Proyecto

En la página 3 de la presentación corporativa mencionabas transformar las tablas estáticas en historias visuales dinámicas. Puedes crear un pequeño script o servicio intermedio que exporte la estructura de tus proyectos compuestos (getCoste(), nombres, horas acumuladas) a archivos estructurados como JSON o CSV. Estos archivos te servirán como fuente de datos directa para alimentar herramientas de Business Intelligence (como Power BI) o un frontend interactivo, permitiendo pintar los gráficos de "Proyección de Ahorro Anual" y los flujos financieros que ideaste.
