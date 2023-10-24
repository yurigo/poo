import java.util.Arrays;
import java.util.Scanner;

public class UI {
    public final String ANSI_RESET = "\u001B[0m";
    public final String ANSI_BLACK = "\u001B[30m";
    public final String ANSI_RED = "\u001B[31m";
    public final String ANSI_GREEN = "\u001B[32m";
    public final String ANSI_YELLOW = "\u001B[33m";
    public final String ANSI_BLUE = "\u001B[34m";
    public final String ANSI_PURPLE = "\u001B[35m";
    public final String ANSI_CYAN = "\u001B[36m";
    public final String ANSI_WHITE = "\u001B[37m";

    Scanner sc;
    public UI(){
        sc = new Scanner(System.in);
    }

    public void wellcome(){
        System.out.println(ANSI_RED + "Bienvenido a Super Stone Paper Scissors GPT 9.1.3 !" + ANSI_RESET);
    }

//    private String[] availableAnswers = {
//            "PIEDRA",
//            "PAPEL",
//            "TIJERAS",
//    } ;

    private boolean verifyAvailableAnswer(String answer){
//        return !answer.equalsIgnoreCase("piedra") &&
//                !answer.equalsIgnoreCase("papel") &&
//                !answer.equalsIgnoreCase("tijeras");

        return !Arrays.asList(Constantes.availableAnswers).contains(answer.toUpperCase());
    }

    private String generaPosiblesRespuestas(){
        String[] c = Constantes.availableAnswers;

        String aux = "";

//        ANSI_CYAN + "piedra" + ANSI_RESET + ", " +
//        ANSI_BLUE + "papel" + ANSI_RESET + ", " +
//        ANSI_RED + "tijeras" + ANSI_RESET

        for (int i = 0 ; i < c.length ; i++){
            aux += ANSI_CYAN + c[i] + ANSI_RESET + ", ";
//            if (i < c.length - 1){
//                aux = aux + ", ";
//            }
        }

        return aux.substring(0, aux.length() - 2);
    }
    private String promptChoosePlay(){
        // String posiblesRespuestas = generaPosiblesRespuestas();
        return ANSI_GREEN + "Elige tu jugada " + ANSI_RESET + "(" + generaPosiblesRespuestas() + "): ";
    }

    public String getHumanPlay() {

        String answer = "";

        while(verifyAvailableAnswer(answer)) {

//            System.out.println(ANSI_GREEN + "Elige tu jugada " + ANSI_RESET + "("+
//                    ANSI_CYAN + "piedra" + ANSI_RESET + ", " +
//                    ANSI_BLUE + "papel" + ANSI_RESET + ", " +
//                    ANSI_RED + "tijeras" + ANSI_RESET + "): " );

            // tengo que hacer dinámico las opciones porque availableAnswers puede variar.

            // String prompt = promptChoosePlay();
            System.out.println(this.promptChoosePlay());
            answer = sc.nextLine();
        }
        return answer;
    }

    public void showResult(String result , String userAnswer, String aiAnswer){
        System.out.println(ANSI_YELLOW + "Has " + result + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Has escogido: " + userAnswer + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Ha salido el: " + aiAnswer + ANSI_RESET);
    }

    public String askPlayAgain(){
        System.out.println(ANSI_GREEN + "Quieres volver a jugar? (S/n)" + ANSI_RESET);
        String answer = sc.nextLine();
        return answer;
    }
}
