import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Clase3 {

    // Calcular promedio
    public double calcularPromedio(Clase1 estudiante) {

        ArrayList<Clase2> lista =
                estudiante.getEvaluaciones();

        if (lista.isEmpty()) {
            return -1;
        }

        double suma = 0;

        for (Clase2 e : lista) {
            suma += e.getNota();
        }

        return suma / lista.size();
    }

    // Mostrar evolución académica
    public void mostrarEvolucion(Clase1 estudiante) {

        ArrayList<Clase2> lista =
                estudiante.getEvaluaciones();

        if (lista.isEmpty()) {
            System.out.println("No existen evaluaciones.");
            return;
        }

        System.out.println("\n--- EVALUCIÓN ACADÉMICA ---");

        for (Clase2 e : lista) {
            System.out.println(
                e.getFecha() + " -> " + e.getNota()
            );
        }

        System.out.printf(
            "Promedio general: %.2f%n",
            calcularPromedio(estudiante)
        );
    }

    // Encontrar subsecuencia creciente más larga
    public ArrayList<Double> subsecuenciaCreciente(
            Clase1 estudiante) {

        ArrayList<Double> notas = new ArrayList<>();

        for (Clase2 e : estudiante.getEvaluaciones()) {
            notas.add(e.getNota());
        }

        int n = notas.size();

        ArrayList<Double> resultado = new ArrayList<>();

        if (n == 0) {
            return resultado;
        }

        int[] dp = new int[n];
        int[] anterior = new int[n];

        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            anterior[i] = -1;
        }

        int mejor = 0;

        for (int i = 1; i < n; i++) {

            for (int j = 0; j < i; j++) {

                if (notas.get(i) > notas.get(j)
                        && dp[j] + 1 > dp[i]) {

                    dp[i] = dp[j] + 1;
                    anterior[i] = j;
                }
            }

            if (dp[i] > dp[mejor]) {
                mejor = i;
            }
        }

        int actual = mejor;

        while (actual != -1) {
            resultado.add(0, notas.get(actual));
            actual = anterior[actual];
        }

        return resultado;
    }

    // Informar estudiantes sin evaluaciones
    public void informarSinEvaluaciones(
            ArrayList<Clase1> estudiantes) {

        System.out.println("\n--- SIN EVALUACIONES ---");

        boolean encontrado = false;

        for (Clase1 e : estudiantes) {

            if (e.getEvaluaciones().isEmpty()) {
                System.out.println(e.getNombre());
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println(
                "Todos tienen evaluaciones."
            );
        }
    }

    // Detectar notas repetidas
    public void mostrarNotasRepetidas(Clase1 estudiante) {

        Set<Double> notas = new HashSet<>();
        Set<Double> repetidas = new HashSet<>();

        for (Clase2 e : estudiante.getEvaluaciones()) {

            double nota = e.getNota();

            if (!notas.add(nota)) {
                repetidas.add(nota);
            }
        }

        System.out.println("\n--- NOTAS REPETIDAS ---");

        if (repetidas.isEmpty()) {
            System.out.println("No existen notas repetidas.");
        } else {
            System.out.println(repetidas);
        }
    }

    // Análisis completo
    public void analizarEstudiante(Clase1 estudiante) {

        if (estudiante.getEvaluaciones().isEmpty()) {
            System.out.println(
                "No se puede analizar: estudiante sin evaluaciones."
            );
            return;
        }

        estudiante.mostrarDatos();

        mostrarEvolucion(estudiante);

        ArrayList<Double> creciente =
                subsecuenciaCreciente(estudiante);

        System.out.println(
            "Subsecuencia creciente: " + creciente
        );

        System.out.println(
            "Longitud de subsecuencia: " + creciente.size()
        );

        mostrarNotasRepetidas(estudiante);
    }
}
