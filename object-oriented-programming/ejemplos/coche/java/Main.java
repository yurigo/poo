// Clase Persona
public class Main {
    public static void main(String[] args) {

        Coche coche1 = new Coche("B1234AA" , 0 );

        coche1.acelerar(40);
        coche1.frenar(20);
        System.out.println(coche1.getInfo());
        coche1.frenar(30);
        System.out.println(coche1.getInfo());


        coche1.frenar(30);
        coche1.acelerar(400);
        System.out.println(coche1.getInfo());

        //coche1.velocidad = 9000;

        coche1.acelerar(9000);
        System.out.println(coche1.getInfo());

        coche1.setVelocidad(800);
        System.out.println(coche1.getInfo());
    }
}