# 📚 Grupo 4 | Análisis avanzado de rendimiento académico

Sistema desarrollado en Java mediante Programación Orientada a Objetos (POO), diseñado para registrar estudiantes, administrar sus evaluaciones y analizar la evolución de sus calificaciones mediante diferentes operaciones y algoritmos.

---

## 👥 Integrantes

| N.º | Apellidos y nombres |
|---|---|
| 1 | Toalombo Punina Jeremy Patricio |
| 2 | Nombre del integrante 2 |
| 3 | Nombre del integrante 3 |

---

## 🎯 Objetivo

Desarrollar un sistema de análisis de rendimiento académico utilizando Java y los principios de programación orientada a objetos, que permita administrar estudiantes y sus evaluaciones, calcular promedios, visualizar la evolución de las calificaciones e identificar la subsecuencia estrictamente creciente más larga, aplicando estructuras dinámicas de datos, validaciones y separación de responsabilidades entre clases.

---

## 🛠️ Tecnologías utilizadas

- Java.
- Programación Orientada a Objetos (POO).
- ArrayList.
- Scanner.
- LocalDate.
- Programación dinámica.
- Git y GitHub.

---

## 📂 Clases y métodos

### 1. Estudiante.java

Administra la información personal de cada estudiante y sus evaluaciones.

**Atributos principales:**
- identificacion
- nombre
- carrera
- evaluaciones

**Métodos principales:**
- `getIdentificacion()`: obtiene la identificación.
- `getNombre()`: obtiene el nombre.
- `agregarEvaluacion()`: registra una evaluación respetando el orden temporal.
- `mostrarDatos()`: presenta la información del estudiante.
- `mostrarEvaluaciones()`: muestra sus evaluaciones registradas.

### 2. Evaluacion.java

Almacena la información correspondiente a cada evaluación académica.

**Atributos principales:**
- nota
- fecha

**Métodos principales:**
- `getNota()`: obtiene la calificación.
- `getFecha()`: obtiene la fecha.
- `mostrarDatos()`: presenta la información de la evaluación.

### 3. Analizador.java

Contiene las operaciones y algoritmos encargados de analizar el rendimiento académico.

**Métodos principales:**
- `calcularPromedio()`: calcula el promedio de las calificaciones.
- `mostrarEvolucion()`: presenta la evolución de las notas.
- `subsecuenciaCreciente()`: encuentra la subsecuencia estrictamente creciente más larga.
- `informarSinEvaluaciones()`: identifica estudiantes sin evaluaciones.
- `mostrarNotasRepetidas()`: detecta calificaciones repetidas.
- `analizarEstudiante()`: ejecuta el análisis general del estudiante.

### 4. Main.java

Controla la ejecución del programa y coordina las operaciones mediante un menú interactivo.

**Métodos principales:**
- `main()`: inicia el sistema y administra el menú.
- `leerEntero()`: valida la lectura de opciones.
- `buscarEstudiante()`: localiza estudiantes por identificación.
- `registrarEstudiante()`: registra nuevos estudiantes.
- `registrarEvaluacion()`: registra las calificaciones.
- `mostrarEstudiantes()`: presenta los estudiantes registrados.
- `analizarRendimiento()`: solicita y ejecuta el análisis académico.
- `mostrarRepetidas()`: consulta las notas repetidas.

---

## ⚙️ Compilación y ejecución

### Requisitos

- Tener instalado Java JDK.
- Disponer de un editor de código como Visual Studio Code, IntelliJ IDEA o NetBeans.

### Pasos de ejecución

1. Clonar o descargar el repositorio.
2. Abrir la carpeta del proyecto en el editor de código.
3. Verificar que los cuatro archivos `.java` estén en el mismo directorio.
4. Abrir una terminal dentro de la carpeta del proyecto.
5. Ejecutar los siguientes comandos:

**Compilación:**

```bash
javac *.java
```

**Ejecución:**

```bash
java Main
```

---

## 📸 Capturas de funcionamiento

En esta sección se presentan las evidencias visuales del funcionamiento del sistema.

### Menú principal

![Menú principal](docs/capturas/menu.png)

### Registro de estudiantes

![Registro de estudiantes](docs/capturas/registro_estudiante.png)

### Registro de evaluaciones

![Registro de evaluaciones](docs/capturas/registro_evaluacion.png)

### Análisis del rendimiento académico

![Análisis académico](docs/capturas/analisis_rendimiento.png)

### Subsecuencia creciente

![Subsecuencia creciente](docs/capturas/subsecuencia.png)

> Las imágenes deben agregarse a la carpeta `docs/capturas/` utilizando los nombres indicados.

---

## 📊 Distribución de responsabilidades

| Integrante | Responsabilidad | Actividades |
|---|---|---|
| Integrante 1 | Gestión de estudiantes y evaluaciones | Desarrollo de `Estudiante.java` y `Evaluacion.java`. |
| Integrante 2 | Análisis académico | Desarrollo de `Analizador.java` y sus algoritmos. |
| Integrante 3 | Integración del sistema | Desarrollo de `Main.java`, menú y coordinación de clases. |
| Todos | Documentación y pruebas | Elaboración del UML, pruebas, README y revisión del proyecto. |

*La distribución debe ajustarse a las actividades que cada integrante haya realizado realmente.*

---

## 📑 Documentación

La documentación complementaria se encuentra organizada en la carpeta `docs/`:

- [Análisis del sistema](docs/analisis.md)
- [Casos de prueba](docs/casos_prueba.md)

---

## 🧪 Caso de referencia

**Entrada:**

```text
[6, 8, 7, 9, 10]
```

**Subsecuencia estrictamente creciente:**

```text
[6, 8, 9, 10]
```

**Longitud obtenida:**

```text
4
```

---

## 📌 Conclusión

El proyecto permite aplicar los fundamentos de la programación orientada a objetos mediante la integración de diferentes clases, el manejo de colecciones dinámicas, la validación de datos y el desarrollo de algoritmos de análisis. Además, facilita la comprensión de la evolución del rendimiento académico a través del procesamiento de calificaciones.

---

**Proyecto académico | Programación Orientada a Objetos | Grupo 4**
