# Parcial Práctico - Primer Tercio (DOSW)

**Estudiante:** Isaac Burgos  
**Grupo:** 1
**Institución:** Escuela Colombiana de Ingeniería Julio Garavito  

---

## Prerrequisitos del Proyecto

### 1. Estructura de Carpetas
El proyecto sigue la estructura de Maven con la adición manual de la carpeta `docs` para la documentación técnica.

### 2. Evidencias de Acceso a Herramientas
A continuación, se presentan las capturas de pantalla que confirman el acceso a las herramientas de diseño y modelado requeridas:


## Tecnologías utilizadas
* **Lenguaje:** Java 21
* **Gestor de Dependencias:** Maven
* **Framework:** Spring Boot 

---

## Punto 2 - Patrones de Diseño Identificados

### Patrón 1: Composite

**a. Nombre del patrón:** Composite

**b. Tipo:** Estructural

**c. Justificación:**  
El sistema maneja una estructura jerárquica (Bootcamp → Grupos → Estudiantes) cuya profundidad no es fija y puede crecer en el tiempo. El patrón Composite permite tratar objetos individuales y compuestos de manera uniforme y modelar estructuras en forma de árbol sin asumir niveles específicos.  Esto facilita la adición futura de subgrupos y nuevas categorías de organización sin modificar el código existente, cumpliendo con el principio Abierto/Cerrado (OCP).

### Patrón 2: Observer

**a. Nombre del patrón:** Observer

**b. Tipo:** De comportamiento

**c. Justificación:**  
El sistema requiere que los promedios se actualicen automáticamente cuando se agregan o modifican evaluaciones.  
El patrón Observer permite que cuando una evaluación cambie, el estudiante (o el sistema de métricas) sea notificado y recalcule el promedio sin generar alto acoplamiento.  Esta propagación en cascada asegura que todos los niveles (estudiante, grupo, bootcamp) mantengan sus promedios actualizados en tiempo real, optimizando el rendimiento de las consultas.

---