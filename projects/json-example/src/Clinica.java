import java.util.ArrayList;

public class Clinica {
    private String nombre;
    private String descripcion;
    private ArrayList<Persona> personas;

    public Clinica() {

    }

    public Clinica(String nombre, String descripcion, ArrayList<Persona> personas) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.personas = personas;
    }

    public String toString(){
        return nombre + ", " + descripcion + ", " + personas.toString();
    }

}
