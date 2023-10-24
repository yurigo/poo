import java.util.Random;

public class Business {

    public Business(){

    }

    /**
     * Esta funcion calcula un numero entero random entre min y max
     * @param max el numero máximo de mi random (exclusivo)
     * @return devuelve el numero random
     */
    private int getRandomNumber(int max){
// return (int)( Math.random() * max - 1) + min;
        Random r = new Random();
        return r.nextInt(max);
    }

    public String getRandomAnswer(){
        return Constantes.availableAnswers[getRandomNumber(Constantes.availableAnswers.length)];
    }

    public String play(String userAnswer, String aiAnswer){
        String result = "perdido";

        // TODO...

        return result;
    }


}
