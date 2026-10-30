import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Clase1> estudiantes =
            new ArrayList<>();

    static Clase3 analizador = new Clase3();

    public static void main(String[] args) {

        int opcion;

        do {

            System.out.println("\n===== SISTEMA DE RENDIMIENTO ACADÉMICO =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar evaluación");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Analizar rendimiento académico");
            System.out.println("5. Informar estudiantes sin evaluaciones");
            System.out.println("6. Mostrar notas repetidas");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = leerEntero();

            switch (opcion) {

                case 1:
                    registrarEstudiante();
                    break;

                case 2:
                    registrarEvaluacion();
                    break;

                case 3:
                    mostrarEstudiantes();
                    break;

                case 4:
                    analizarRendimiento();
                    break;

                case 5:
                    analizador.informarSinEvaluaciones(estudiantes);
                    break;

                case 6:
                    mostrarRepetidas();
                    break;

                case 7:
                    System.out.println("Sistema finalizado.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 7);

        sc.close();
    }

    // Leer números enteros
    public static int leerEntero() {

        while (!sc.hasNextInt()) {
            System.out.print("Ingrese un número entero válido: ");
            sc.nextLine();
        }
        int numero = sc.nextInt();
        sc.nextLine();

        return numero;
    }

    // Buscar estudiante
    public static Clase1 buscarEstudiante(String id) {

        for (Clase1 e : estudiantes) {

            if (e.getIdentificacion().equalsIgnoreCase(id)) {
                return e;
            }
        }

        return null;
    }

    // Registrar estudiante
    public static void registrarEstudiante() {

        System.out.print("Identificación: ");
        String id = sc.nextLine().trim();

        if (id.isEmpty() || buscarEstudiante(id) != null) {
            System.out.println(
                "Identificación vacía o duplicada."
            );
            return;
        }

        System.out.print("Nombre: ");
        String nombre = sc.nextLine().trim();

        System.out.print("Carrera: ");
        String carrera = sc.nextLine().trim();

        if (nombre.isEmpty() || carrera.isEmpty()) {
            System.out.println(
                "Los campos no pueden estar vacíos."
            );
            return;
        }

        estudiantes.add(
            new Clase1(id, nombre, carrera)
        );

        System.out.println(
            "Estudiante registrado correctamente."
        );
    }

    // Registrar evaluación
    public static void registrarEvaluacion() {

        System.out.print("Identificación del estudiante: ");
        String id = sc.nextLine().trim();

        Clase1 estudiante = buscarEstudiante(id);

        if (estudiante == null) {
            System.out.println("Estudiante no encontrado.");
            return;
        }

        System.out.print("Ingrese la fecha (AAAA-MM-DD): ");
        String fechaTexto = sc.nextLine();

        LocalDate fecha;

        try {
            fecha = LocalDate.parse(fechaTexto);
        } catch (Exception e) {
            System.out.println("Formato de fecha incorrecto.");
            return;
        }

       
