public class Controller {
    UI ui;
    Business business;

    public Controller(UI ui, Business business){
        this.ui = ui;
        this.business = business;
    }

    public void run(){

        String again = "S";
        do {
            play();
            again = ui.askPlayAgain();
        } while (again.equalsIgnoreCase("S"));

    }
    private void play(){
        String answer = ui.getHumanPlay();
        String randomIAPlay = business.getRandomAnswer();
        String result = business.play(answer , randomIAPlay);
        ui.showResult(result , answer, randomIAPlay);
    }

}
