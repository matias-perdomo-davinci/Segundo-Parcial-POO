public abstract class Usuario {
    // ATRIBUTOS
    private int dni;
    private String nombre;
    private String apellido;

    //CONSTRUCTORES
    public Usuario(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getters y Setters
    public void setDni(int dni) {
        this.dni = dni;
    }
    public int getDni() {
        return dni;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getApellido() {
        return apellido;
    }
    //Metodos Abstractos

    //Metodo toString
    @Override
    public String toString(){
        return "El dni del " + getClass().getSimpleName() + " es " + this.dni;
        }
}
