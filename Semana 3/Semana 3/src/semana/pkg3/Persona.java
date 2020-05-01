package semana.pkg3;

public class Persona {

    private String nombre, apellido;

    public Persona(String newNombre, String newApellido) {
        this.nombre = newNombre;
        this.apellido = newApellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
