import static java.lang.Thread.sleep;

public class Controller {
    private Board board;
    private PresentationInterface presentationI;

    public Controller(Board board, PresentationInterface pi) {
        this.board = board;
        this.presentationI = pi;
    }

    public void run(){
        try {
            while(true) {
                presentationI.draw(board);
                sleep(2000);
                board = board.nextGen();
                presentationI.clear();
            }
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
