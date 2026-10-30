# ANÁLISIS DEL SISTEMA
## Grupo 4 – Análisis avanzado de rendimiento académico

## 1. Descripción del problema

La universidad necesita implementar un sistema informático que permita registrar estudiantes y realizar un seguimiento de la evolución de sus calificaciones durante diferentes evaluaciones académicas.

El análisis manual de las calificaciones puede dificultar el cálculo de promedios, la identificación de notas repetidas y la observación de los cambios en el rendimiento de cada estudiante.

Por esta razón, se plantea desarrollar una aplicación utilizando el lenguaje de programación Java y los principios de Programación Orientada a Objetos (POO).

El sistema permitirá registrar varios estudiantes, almacenar sus evaluaciones en orden cronológico, validar las calificaciones ingresadas y realizar diferentes operaciones para analizar su rendimiento académico.

Además, se implementará un algoritmo que permita encontrar la longitud de la subsecuencia estrictamente creciente más larga de las calificaciones, sin necesidad de que sus elementos sean consecutivos.

## 2. Objetivo general

Desarrollar un sistema de análisis avanzado de rendimiento académico mediante Java y Programación Orientada a Objetos, que permita administrar estudiantes y sus evaluaciones, calcular promedios, visualizar la evolución de las calificaciones e identificar la subsecuencia estrictamente creciente más larga, aplicando estructuras dinámicas de datos, validaciones y algoritmos de programación dinámica.

## 3. Objetivos específicos

- Registrar estudiantes mediante una identificación única, nombre y carrera.
- Administrar las evaluaciones de cada estudiante.
- Validar que las calificaciones estén comprendidas entre 0 y 10.
- Garantizar que las evaluaciones se registren en orden temporal.
- Calcular el promedio de las calificaciones registradas.
- Mostrar la evolución académica de cada estudiante.
- Encontrar la subsecuencia estrictamente creciente más larga.
- Identificar estudiantes que no tengan evaluaciones registradas.
- Detectar calificaciones repetidas.
- Aplicar encapsulamiento y separación de responsabilidades mediante clases y métodos.

## 4. Entradas del sistema

El sistema recibe información proporcionada por el usuario mediante un menú interactivo desarrollado con la clase `Scanner`.

### 4.1 Datos de los estudiantes

| Dato | Tipo de dato | Descripción |
|---|---|---|
| Identificación | String | Código único para identificar al estudiante. |
| Nombre | String | Nombres y apellidos del estudiante. |
| Carrera | String | Carrera universitaria a la que pertenece. |

### 4.2 Datos de las evaluaciones

| Dato | Tipo de dato | Descripción |
|---|---|---|
| Nota | double | Calificación obtenida en una evaluación, entre 0 y 10. |
| Fecha | LocalDate | Fecha en la que se realizó la evaluación. |

### 4.3 Opciones del menú

El usuario puede seleccionar las siguientes opciones:

1. Registrar estudiante.
2. Registrar evaluación.
3. Mostrar estudiantes.
4. Analizar rendimiento académico.
5. Informar estudiantes sin evaluaciones.
6. Mostrar notas repetidas.
7. Salir del sistema.

## 5. Validaciones de entrada

Para garantizar el correcto funcionamiento del programa, se establecen las siguientes validaciones:

| Validación | Condición | Acción |
|---|---|---|
| Identificación | No debe estar vacía ni repetida. | Rechazar el registro. |
| Nombre | No debe estar vacío. | Solicitar un dato válido. |
| Carrera | No debe estar vacía. | Solicitar un dato válido. |
| Nota | Debe estar entre 0 y 10. | Rechazar valores fuera del intervalo. |
| Fecha | Debe tener un formato válido. | Rechazar fechas incorrectas. |
| Orden temporal | No puede ser anterior a la última evaluación registrada. | Rechazar la evaluación. |
| Estudiante | Debe existir previamente. | Informar que no fue encontrado. |
| Menú | Debe corresponder a una opción disponible. | Mostrar mensaje de opción incorrecta. |
| Evaluaciones | Puede existir un estudiante sin registros. | Informar que no tiene evaluaciones. |

Estas validaciones permiten evitar registros incorrectos y operaciones que puedan afectar los resultados del análisis académico.

## 6. Procesos del sistema

El programa realiza diferentes procesos para administrar y analizar la información académica.

### 6.1 Registro de estudiantes

El usuario ingresa la identificación, el nombre y la carrera del estudiante.

El sistema comprueba que la identificación no se encuentre registrada anteriormente y que los campos obligatorios no estén vacíos.

Si los datos son correctos, se crea un objeto de la clase `Estudiante` y se almacena en un `ArrayList`.

### 6.2 Registro de evaluaciones

El usuario selecciona un estudiante mediante su identificación y proporciona la fecha y la calificación correspondiente.

El sistema verifica que:

- El estudiante exista.
- La nota esté entre 0 y 10.
- La fecha tenga un formato válido.
- La fecha no sea anterior a la última evaluación registrada.

Si todas las condiciones se cumplen, se crea un objeto de la clase `Evaluacion` y se agrega a la lista del estudiante.

### 6.3 Cálculo del promedio académico

El promedio se obtiene sumando todas las calificaciones registradas y dividiendo el resultado para la cantidad de evaluaciones.

**Fórmula:**

Promedio = Suma de las notas / Número de evaluaciones

**Ejemplo:**

Notas: 6, 8, 7, 9, 10.

Promedio = (6 + 8 + 7 + 9 + 10) / 5

Promedio = 40 / 5

Promedio = 8.00

Si el estudiante no tiene evaluaciones, el sistema informa que no es posible calcular el promedio.

### 6.4 Visualización de la evolución académica

El sistema muestra las calificaciones registradas junto con sus respectivas fechas.

Esto permite observar los cambios en el rendimiento académico del estudiante durante el período de evaluaciones.

También se presenta el promedio general de las calificaciones registradas.

### 6.5 Búsqueda de la subsecuencia estrictamente creciente más larga

El sistema implementa un algoritmo de programación dinámica para encontrar la mayor subsecuencia estrictamente creciente de las calificaciones.

Una subsecuencia es un conjunto de elementos seleccionados de una secuencia original, manteniendo su orden, pero sin necesidad de que sean consecutivos.

Para que sea estrictamente creciente, cada calificación seleccionada debe ser mayor que la anterior.

**Ejemplo de entrada:**

[6, 8, 7, 9, 10]

**Proceso:**

- Se inicia con la nota 6.
- Se selecciona la nota 8 porque es mayor que 6.
- La nota 7 no se incorpora porque no permite obtener una subsecuencia más larga en esa posición.
- Se selecciona la nota 9 porque es mayor que 8.
- Finalmente, se selecciona la nota 10 porque es mayor que 9.

**Resultado:**

Subsecuencia creciente: [6, 8, 9, 10]

Longitud de la subsecuencia: 4.

El algoritmo utiliza dos arreglos auxiliares:

- `dp`: almacena la longitud de la subsecuencia creciente más larga que termina en cada posición.
- `anterior`: permite reconstruir los elementos que forman la subsecuencia encontrada.

La condición principal utilizada es:

`notas.get(i) > notas.get(j)`

Esta condición garantiza que las calificaciones seleccionadas sean estrictamente crecientes.

### 6.6 Identificación de estudiantes sin evaluaciones

El sistema recorre la lista de estudiantes y verifica si cada uno tiene evaluaciones registradas.

Cuando encuentra un estudiante cuya lista de evaluaciones está vacía, muestra su nombre e informa que todavía no tiene calificaciones registradas.

### 6.7 Detección de notas repetidas

El sistema analiza las calificaciones de cada estudiante para identificar aquellas que aparecen más de una vez.

Se utilizan estructuras `HashSet` para almacenar las notas encontradas y las notas repetidas.

De esta manera, se evita mostrar varias veces una misma calificación repetida.

**Ejemplo:**

Notas registradas: [6, 8, 6, 9, 8]

Notas repetidas: [6.0, 8.0]

## 7. Salidas del sistema

Después de ejecutar las operaciones, el programa presenta los siguientes resultados:

| Proceso | Salida |
|---|---|
| Registro de estudiantes | Confirmación del registro o mensaje de error. |
| Registro de evaluaciones | Confirmación o rechazo de la evaluación. |
| Mostrar estudiantes | Identificación, nombre, carrera y cantidad de evaluaciones. |
| Calcular promedio | Promedio general de las calificaciones. |
| Mostrar evolución | Fechas y notas registradas. |
| Subsecuencia creciente | Secuencia encontrada y su longitud. |
| Estudiantes sin evaluaciones | Listado de estudiantes sin calificaciones. |
| Notas repetidas | Listado de calificaciones que aparecen más de una vez. |

## 8. Diseño y organización de las clases

El sistema está compuesto por cuatro clases principales, cada una con responsabilidades específicas.

### 8.1 Clase Estudiante

Su función es almacenar y administrar la información de cada estudiante.

**Atributos:**

- `identificacion`: identificación del estudiante.
- `nombre`: nombre completo.
- `carrera`: carrera universitaria.
- `evaluaciones`: lista de evaluaciones registradas.

**Métodos principales:**

- `getIdentificacion()`: obtiene la identificación.
- `getNombre()`: obtiene el nombre.
- `getCarrera()`: obtiene la carrera.
- `getEvaluaciones()`: permite consultar las evaluaciones.
- `agregarEvaluacion()`: agrega una evaluación respetando el orden temporal.
- `mostrarDatos()`: muestra la información del estudiante.
- `mostrarEvaluaciones()`: presenta su historial académico.

### 8.2 Clase Evaluacion

Representa cada evaluación académica realizada por un estudiante.

**Atributos:**

- `nota`: calificación obtenida.
- `fecha`: fecha de la evaluación.

**Métodos principales:**

- `getNota()`: obtiene la calificación.
- `getFecha()`: obtiene la fecha.
- `mostrarDatos()`: muestra la nota y su fecha.

### 8.3 Clase Analizador

Contiene los métodos encargados de realizar los cálculos y análisis del rendimiento académico.

**Métodos principales:**

- `calcularPromedio()`: calcula el promedio de las evaluaciones.
- `mostrarEvolucion()`: presenta el historial de calificaciones.
- `subsecuenciaCreciente()`: encuentra la subsecuencia estrictamente creciente más larga.
- `informarSinEvaluaciones()`: identifica estudiantes sin evaluaciones.
- `mostrarNotasRepetidas()`: detecta las calificaciones repetidas.
- `analizarEstudiante()`: reúne los principales análisis de un estudiante.

### 8.4 Clase Main

Es la clase encargada de iniciar y controlar la ejecución del programa.

**Métodos principales:**

- `main()`: inicia el sistema y presenta el menú.
- `leerEntero()`: permite ingresar opciones numéricas.
- `buscarEstudiante()`: busca un estudiante por identificación.
- `registrarEstudiante()`: registra nuevos estudiantes.
- `registrarEvaluacion()`: registra nuevas evaluaciones.
- `mostrarEstudiantes()`: muestra los estudiantes registrados.
- `analizarRendimiento()`: coordina el análisis académico.
- `mostrarRepetidas()`: permite consultar las notas repetidas.

## 9. Decisiones de diseño

Para desarrollar el sistema se tomaron las siguientes decisiones:

### 9.1 Programación orientada a objetos

Se utilizaron cuatro clases para organizar el código y separar las responsabilidades de cada componente.

Esta organización facilita el mantenimiento, la comprensión y la reutilización del código.

### 9.2 Encapsulamiento

Los atributos se declararon como `private` para proteger la información y controlar su acceso mediante métodos públicos.

### 9.3 Uso de ArrayList

Se seleccionó `ArrayList` porque permite almacenar varios estudiantes y agregar evaluaciones dinámicamente, sin establecer una cantidad fija de registros.

### 9.4 Uso de LocalDate

Se utilizó `LocalDate` para almacenar las fechas de las evaluaciones y comprobar que los registros respeten el orden cronológico.

### 9.5 Uso de HashSet

Se empleó `HashSet` para detectar notas repetidas sin almacenar varias veces el mismo valor en el conjunto de resultados.

### 9.6 Programación dinámica

Se implementó programación dinámica para resolver el problema de la subsecuencia estrictamente creciente más larga.

Esta técnica permite calcular la longitud de las subsecuencias y reconstruir la secuencia seleccionada.

### 9.7 Separación de responsabilidades

Se estableció que cada clase debe encargarse de una parte específica del sistema.

La clase `Main` controla el menú, mientras que las clases `Estudiante`, `Evaluacion` y `Analizador` administran los datos y las operaciones correspondientes.

### 9.8 Control de errores

Se utilizaron estructuras condicionales, ciclos y bloques `try-catch` para controlar entradas incorrectas, fechas inválidas y operaciones no permitidas.

## 10. Relación entre las clases

Las clases mantienen las siguientes relaciones:

- `Main` utiliza objetos de `Estudiante` y `Analizador` para coordinar las operaciones.
- `Estudiante` contiene una lista de objetos `Evaluacion`.
- `Evaluacion` almacena una calificación y su fecha.
- `Analizador` recibe estudiantes y procesa sus evaluaciones para obtener los resultados académicos.

Un estudiante puede tener cero o muchas evaluaciones, mientras que cada evaluación pertenece a un estudiante.

## 11. Algoritmos y estructuras utilizadas

| Elemento | Aplicación |
|---|---|
| ArrayList | Almacenamiento de estudiantes y evaluaciones. |
| HashSet | Identificación de calificaciones repetidas. |
| Ciclo for | Recorrido de estudiantes y evaluaciones. |
| Ciclo do-while | Control del menú principal. |
| switch | Selección de operaciones. |
| Condicionales if | Validación de datos y control de operaciones. |
| Programación dinámica | Búsqueda de la subsecuencia creciente más larga. |
| LocalDate | Administración de fechas. |
| try-catch | Manejo de errores de entrada y validaciones. |

## 12. Conclusión

El desarrollo de este sistema permite aplicar los conocimientos de programación orientada a objetos mediante la creación e integración de clases, el uso de atributos privados, constructores, métodos públicos y estructuras dinámicas de datos.

Además, permite implementar diferentes operaciones relacionadas con el análisis académico, como el cálculo de promedios, la visualización de la evolución de las calificaciones, la identificación de notas repetidas y la búsqueda de la subsecuencia estrictamente creciente más larga.

La utilización de programación dinámica permite resolver un problema algorítmico que requiere analizar las calificaciones manteniendo su orden original.

Finalmente, la separación de responsabilidades facilita la organización del proyecto, mejora la comprensión del código y permite que cada integrante participe en el desarrollo de una parte específica del sistema.
