import java.util.Scanner;

public class UI {
    Scanner sc; //= new Scanner(System.in);

    public UI(){
        this.sc = new Scanner(System.in);
    }

    public void showIntroMessage(){
        System.out.println("Usa las teclas A/S/D/W");
        System.out.println("Presiona 'q' para salir");
    }

    public char readChar(){
        return sc.next().charAt(0);
    }

    public void show(String s){
        System.out.println(s);
    }
}
