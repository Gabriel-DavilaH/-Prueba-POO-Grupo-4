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

       
