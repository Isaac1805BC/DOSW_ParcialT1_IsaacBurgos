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

## Desarrollo parcial primer tercio

### Diagrama de contexto

![alt text](image-1.png)

### Segundo Punto. Indetificar dos patrones de diseño que se puedan aplicar al caso de estudio
Patrón 1: Composite

a. Nombre del patrón: Composite

b. Tipo: Estructural

c. Justificación:
El sistema maneja una estructura jerarquica y debe permitir registrar la estructura del curso
Patrón 2: Observer

a. Nombre del patrón: Observer

b. Tipo: De comportamiento

c. Justificación:
El sistema requiere que los promedios se actualicen automáticamente cuando se agregan o modifican evaluaciones.
El patrón Observer permite que cuando una evaluación cambie, el estudiante sea notificado y recalcule el promedio sin generar alto acoplamiento.

### Tercer punto .Identifique 5 requerimientos del sistema y clasifíquelos en funcionales (3) y no funcionales (2). Garantice que al menos un requerimiento funcional seleccionado utilice uno o los dos patrones identificados. (Añadirlo al README.md)**

**Requisistos No funcionales** La Interfaz debe ser responsive, La aplicacion web ultilice colores verde y blanco

**Requisitos funcionales** Calculo dinamico del promedio ponderado por estudiante,grupo,modulo y promedio general del bootcamp, el sistema debe poder obtener el listado de los estudiantes que estan en riesgo academico(Promedio Ponderado menor que 3.0) , el sistema debe poder registrar la estructura academica jerárquica del curso  


### Cuarto Punto . Del listado anterior, seleccione los 2 requerimientos funcionales más importantes del sistema y desarrolle un diagrama de casos de uso con su respectiva historia de usuario. Garantiza que al menos un requerimiento funcional seleccionado utilice un patrón identificado


![alt text](image.png)

1. COMO estudiante QUIERO Calcular el promedio Ponderado PARA PODER saber si puedo aplicar a becas o intercambios fuera del pais
2. COMO Profesor QUIERO ver el listado de los estudiantes con riesgo academico PARA PODER saber si se puede lograr ayudar a mejorar al estudiante de alguna manera

## Punto 5 Especifique los 2 requerimientos funcionales seleccionados en el punto anterior, siguiendo la plantilla de Análisis de requerimientos.

**Nombre:** calcular dinámicamenteel promedio ponderado 
**Descripción:** El sistema debe permitir calcular el promedio ponderado por estudiante, el promedio por grupo, el promedio por módulo, el promedio general del bootcamp.
**Cómo se ejecutará:** A través de la página web principal de la institución, accesible desde cualquier navegador estánda.
**Actor Principal:** Estudiantes.
**Precondiciones:** El usuario debe ser estudiante activo de la escuela.

**Datos de entrada y de salida:** 
* **Entrada:** Nombres, apellidos.
* **Salida:** Promedio Ponderado.

**Nombre:** Ver Listado de estudiantes que estan en riesgo academico
**Descripción:** El sistema debe permitir ver la lista de los estudiantes que estan en riesgo academico (Promedio ponderado menor de 3.0).
**Cómo se ejecutará:** A través de la página web principal de la institución, accesible desde cualquier navegador estánda.
**Actor Principal:** Profesores.
**Precondiciones:** El usuario debe ser indetificado como profesor.

**Datos de entrada y de salida:** 
* **Entrada:** Nombres, apellidos.
* **Salida:** Promedio Ponderado.



