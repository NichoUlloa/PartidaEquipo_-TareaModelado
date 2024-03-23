package modelo;
public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private String run;

    // Constructor
    public Persona(String nombre, String apellido, int edad, String nacionalidad, String run) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.run = run;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getRun() {
        return run;
    }
    public void setRun(String run) {
        this.run = run;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Edad: " + edad + "\n" +
                "Nacionalidad: " + nacionalidad + "\n" +
                "Run: " + run + "\n";
    }
}
