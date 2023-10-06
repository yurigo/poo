import java.util.*;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static private String[] availableAnswers = {
            "PIEDRA",
            "PAPEL",
            "TIJERAS",
    } ;

    /**
     * Esta funcion calcula un numero entero random entre min y max
     * @param max el numero máximo de mi random (exclusivo)
     * @return devuelve el numero random
     */
    static private int getRandomNumber(int max){
        // return (int)( Math.random() * max - 1) + min;
        Random r = new Random();
        return r.nextInt(max);
    }

    static private String getRandomAnswer(){
        return availableAnswers[getRandomNumber(3)];
    }


    public static void main(String[] args) {
        String again = "S";

        System.out.println(ANSI_RED + "Bienvenido a Super Stone Paper Scissors GPT 9.1.3 !" + ANSI_RESET);

        do {
            play();
            again = askPlayAgain();
        } while (again.equalsIgnoreCase("S"));

    }

    static private boolean verifyAvailableAnswer(String answer){
//        return !answer.equalsIgnoreCase("piedra") &&
//                !answer.equalsIgnoreCase("papel") &&
//                !answer.equalsIgnoreCase("tijeras");

        return !Arrays.asList(availableAnswers).contains(answer.toUpperCase());
    }

     static private void play(){
         String answer = getHumanPlay();
         String randomIAPlay = getRandomAnswer();

         // TODO ...

         System.out.println(ANSI_YELLOW + "Has escogido: " + answer + ANSI_RESET);
         System.out.println(ANSI_YELLOW + "Ha salido el: " + randomIAPlay + ANSI_RESET);
    }

    private static String getHumanPlay() {
        Scanner sc = new Scanner(System.in);
        String answer = "";

        while(verifyAvailableAnswer(answer)) {

            System.out.println(ANSI_GREEN + "Elige tu jugada " + ANSI_RESET + "("+
                    ANSI_CYAN + "piedra" + ANSI_RESET + ", " +
                    ANSI_BLUE + "papel" + ANSI_RESET + ", " +
                    ANSI_RED + "tijeras" + ANSI_RESET + "): " );

            answer = sc.nextLine();
        }
        return answer;
    }

    static private String askPlayAgain(){
         System.out.println(ANSI_GREEN + "Quieres volver a jugar? (S/n)" + ANSI_RESET);

         Scanner sc = new Scanner(System.in);
         String answer = sc.nextLine();

         return answer;
    }
}