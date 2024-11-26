public class Board {
    private int COLS = 10;
    private int ROWS = 10;
    private Cell[][] cells;

    public Board() {
        cells = new Cell[ROWS][COLS];
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cells[row][col] = new Cell(row, col);
            }
        }
        cells[0][0].setAlive(true);
        cells[1][2].setAlive(true);
        cells[1][3].setAlive(true);
        cells[(int)ROWS/2][(int)COLS/2].setAlive(true);
        cells[ROWS-1][COLS-1].setAlive(true);
    }

    public Board nextGen(){
        Board board = new Board();
        // board = this
        return board;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < COLS; i++) {
            for (int j = 0; j < ROWS; j++) {
                // result += cells[j][i].isAlive() ? "O" : ".";
                result += cells[j][i].toString() + " ";
            }
            result += "\n";
        }
        return result;
    }
}
