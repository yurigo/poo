import java.util.ArrayList;

public class Usuario {

    private String id;
    private String nombre;
    private ArrayList<Mensaje> mensajes;


    // -----------------------------------

    public Usuario(String id, String nombre){
        this.id = id;
        this.nombre = nombre;
        this.mensajes = new ArrayList<>();
    }

    // --------------------------

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

//    public void setMensajes(ArrayList<Mensaje> mensajes) {
//        this.mensajes = mensajes;
//    }

    // -------------------------------

    public void addMessage(Mensaje mensaje){
        mensajes.add(mensaje);
    }

    public void addMessage(String id, String mensaje){
        Mensaje m = new Mensaje(id, mensaje);
        mensajes.add(m);
    }
}
