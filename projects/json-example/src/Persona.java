import java.util.ArrayList;

public class Persona {

    private static final String FILENAME = "hola";
    private int id;
    private String nombre;
    private int edad;
    private ArrayList<Medicamento> medicamentos;

    public Persona(int id, String nombre, int edad, ArrayList<Medicamento> medicamentos) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.medicamentos = medicamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }


    public String toString(){
        return id + " " + nombre + " " + edad + " " + medicamentos.toString();
    }
}
