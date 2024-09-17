import javax.swing.tree.ExpandVetoException;

public class Persona{
    // atributos
    private String DNI;
    private String nom;

    // getters y setters

    public String getDNI() {
        return this.DNI;
    }
    public void setDNI(String DNI) {
        // controlar cosas
        if (DNI.equals("")) return;
        this.DNI = DNI;
    }

    // metodos
    public void login(){
        // ???
    }

    public void logout() {
        // ???
    }

}