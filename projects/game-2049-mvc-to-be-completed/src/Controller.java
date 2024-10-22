public class Controller {
    UI ui;
    Board board;

    public Controller(UI ui, Board board){
        this.ui = ui;
        this.board = board;
    }

    private void doOption(char c){
        //if (c == 'q') return false;
        if (c == 'q') System.exit(0);

        switch (c) {
            case 'a':
                this.board.moveLeft();
                break;
            case 's':
                this.board.moveDown();
                break;
            case 'd':
                this.board.moveRight();
                break;
            case 'w':
                this.board.moveUp();
                break;
        }

        //return true;
    }

    private void play() {
        while (true) {
            this.ui.show("Dame una dirección:");
            char c = this.ui.readChar();

            //if (!this.doOption(c)) break;
            this.doOption(c);

            // añadir un numero random en el tablero.
            this.board.addRandomNumber();

            this.ui.show(this.board.toString());

            // he perdido?

            // he ganado?

        }
    }

    public void run() {
        this.ui.showIntroMessage();
        String boardString = this.board.toString();
        this.ui.show(boardString);
        this.play();
    }


}
