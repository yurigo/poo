public class Mensaje {
    public String getId() {
        return id;
    }

    public String getMensaje() {
        return mensaje;
    }

    String id;
    String mensaje;

    public Mensaje(String id , String mensaje){
        this.id = id;
        this.mensaje = mensaje;
    }

    public String showMensaje(){
        return this.id + ": " + this.mensaje;
    }


}
