
public class Coche {
    private String matricula;
    private int velocidad;
    public Coche(String matricula , int velocidad){
        this.matricula = matricula;
        this.velocidad = velocidad;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void acelerar(int velocidad){
        //this.velocidad = this.velocidad + velocidad;
        this.velocidad += velocidad;
//        if (this.velocidad > 300) {
//            this.velocidad = 300;
//        }

        if (this.velocidad > 300){
            this.velocidad = 300;
        }
        //this.velocidad = (this.velocidad > 300) ? 300 : this.velocidad;
        //this.velocidad = Math.min(this.velocidad, 300);
    }

    public void setVelocidad(int velocidad) {

        this.velocidad = velocidad;
        if (this.velocidad < 0) this.velocidad = 0;
        if (this.velocidad > 300) this.velocidad = 300;

    }

    public void frenar(int velocidad){
        this.velocidad -= velocidad;
        if (this.velocidad < 0) this.velocidad = 0;
    }

    public int getVelocidad(){
        return this.velocidad;
    }

    public String getInfo(){
        return "el coche " + this.matricula + " va a: " + this.velocidad + "km/h";
    }




}
