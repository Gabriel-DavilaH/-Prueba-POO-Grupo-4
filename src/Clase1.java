import java.util.ArrayList;

public class Clase1 {

    private String identificacion;
    private String nombre;
    private String carrera;
    private ArrayList<Clase2> evaluaciones;

    public Clase1(String identificacion, String nombre, String carrera) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.carrera = carrera;
        this.evaluaciones = new ArrayList<>();
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public ArrayList<Clase2> getEvaluaciones() {
        return new ArrayList<>(evaluaciones);
    }

    public void agregarEvaluacion(Clase2 evaluacion) {

        if (!evaluaciones.isEmpty()) {

            int ultima = evaluaciones.size() - 1;

            if (evaluacion.getFecha().isBefore(
                    evaluaciones.get(ultima).getFecha())) {

                throw new IllegalArgumentException(
                    "La fecha debe ser posterior o igual a la última evaluación."
                );
            }
        }

        evaluaciones.add(evaluacion);
    }

    public void mostrarDatos() {

        System.out.println("\nID: " + identificacion);
        System.out.println("Nombre: " + nombre);
        System.out.println("Carrera: " + carrera);
        System.out.println("Cantidad de evaluaciones: "
                + evaluaciones.size());
    }

    public void mostrarEvaluaciones() {

        if (evaluaciones.isEmpty()) {
            System.out.println("El estudiante no tiene evaluaciones.");
            return;
        }

        for (Clase2 e : evaluaciones) {
            e.mostrarDatos();
        }
    }
}
