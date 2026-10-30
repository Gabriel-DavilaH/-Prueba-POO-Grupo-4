import java.time.LocalDate;

public class Clase2 {

    private double nota;
    private LocalDate fecha;

    public Clase2(double nota, LocalDate fecha) {

        if (!Double.isFinite(nota) || nota < 0 || nota > 10) {
            throw new IllegalArgumentException(
                "La nota debe estar entre 0 y 10."
            );
        }

        if (fecha == null) {
            throw new IllegalArgumentException(
                "La fecha no puede estar vacía."
            );
        }

        this.nota = nota;
        this.fecha = fecha;
    }

    public double getNota() {
        return nota;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void mostrarDatos() {

        System.out.println(
            "Fecha: " + fecha + " | Nota: " + nota
        );
    }
}
