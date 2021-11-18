import java.util.ArrayList;

public class Estudiante extends Usuario{
    // ATRIBUTOS
    private String carrera;
    private ArrayList<String> materiasAprobadas = new ArrayList<String>();
    private ArrayList<String> materiasInscriptas = new ArrayList<String>();

    //CONSTRUCTORES
    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }

    //METODOS
    public void imprimirMateriasAprobadas() {
        System.out.println("Materias aprobadas:");
        for (int i = 0; i < materiasAprobadas.size(); i++) {
            System.out.println(materiasAprobadas.get(i));
        }
    }
    public void imprimirMateriasInscriptas(){
        System.out.println("Materias Inscriptas:");
        for (int i = 0; i < materiasInscriptas.size(); i++) {
            System.out.println(materiasInscriptas.get(i));
        }
    }

    //Getters y Setters

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setMateriasAprobadas(ArrayList<String> materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
    public ArrayList<String> getMateriasAprobadas() {
        return materiasAprobadas;
    }
    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }
    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

}
