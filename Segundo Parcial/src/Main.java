import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor(100, "John", "Doe");
        Estudiante estudiante1 = new Estudiante(42627515, "Matias", "Perdomo", "Analista");

        estudiante1.getMateriasAprobadas().add("Matematica");
        estudiante1.getMateriasAprobadas().add("POO");
        estudiante1.getMateriasAprobadas().add("UX");

        estudiante1.getMateriasInscriptas().add("Programacion Web");
        estudiante1.getMateriasInscriptas().add("Base de datos");

        System.out.println(estudiante1);
        System.out.println(profesor1);

        estudiante1.imprimirMateriasAprobadas();
        estudiante1.imprimirMateriasInscriptas();
    }
}
