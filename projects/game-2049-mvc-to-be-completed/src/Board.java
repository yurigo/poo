import java.util.Random;

public class Board{
    final static int FIL = 4;
    final static int COL = 4;
    int[][] board = {
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0},
            {0,0,0,0}
    };

    public Board(){
        this.initialize();
    }

    private void initialize(){
        // Math.random me da un valor del 0 al 1.
        int y = (int)(Math.random() * COL);
        int x = (int)(Math.random() * FIL);
        board[x][y] = 2;
        int y2 = (int)(Math.random() * COL);
        int x2 = (int)(Math.random() * FIL);
        board[x2][y2] = 2;
    }

    private String drawSpaces(Integer number){
        // get the digits from number
        String numberString = number.toString();
        return " ".repeat(5 - numberString.length());

    }

    public String toString(){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < FIL; i++){
            for (int j = 0; j < COL; j++){
                result.append(board[i][j]).append(drawSpaces(board[i][j]));
            }
            result.append("\n");
        }
        return result.toString();
    }

    public void display(){
        System.out.println(this.toString());
    }

    public void moveUp() {
        for (int col = 0; col < FIL; col++) {
            int[] newCol = new int[FIL];
            int pos = 0;

            // Shift non-zero elements to newCol and combine adjacent equal elements
            for (int row = 0; row < FIL; row++) {
                if (board[row][col] != 0) {
                    if (pos > 0 && newCol[pos - 1] == board[row][col]) {
                        newCol[pos - 1] *= 2;
                    } else {
                        newCol[pos++] = board[row][col];
                    }
                }
            }

            // Copy newCol back to the original board column
            for (int row = 0; row < FIL; row++) {
                board[row][col] = newCol[row];
            }
        }
    }

    public void moveRight() {
        for (int row = 0; row < FIL; row++) {
            int[] newRow = new int[FIL];
            int pos = FIL - 1;

            // Shift non-zero elements to newRow and combine adjacent equal elements
            for (int col = FIL - 1; col >= 0; col--) {
                if (board[row][col] != 0) {
                    if (pos < FIL - 1 && newRow[pos + 1] == board[row][col]) {
                        newRow[pos + 1] *= 2;
                    } else {
                        newRow[pos--] = board[row][col];
                    }
                }
            }

            // Copy newRow back to the original board row
            for (int col = 0; col < FIL; col++) {
                board[row][col] = newRow[col];
            }
        }
    }

    public void moveDown() {
        for (int col = 0; col < FIL; col++) {
            int[] newCol = new int[FIL];
            int pos = FIL - 1;

            // Shift non-zero elements to newCol and combine adjacent equal elements
            for (int row = FIL - 1; row >= 0; row--) {
                if (board[row][col] != 0) {
                    if (pos < FIL - 1 && newCol[pos + 1] == board[row][col]) {
                        newCol[pos + 1] *= 2;
                    } else {
                        newCol[pos--] = board[row][col];
                    }
                }
            }

            // Copy newCol back to the original board column
            for (int row = 0; row < FIL; row++) {
                board[row][col] = newCol[row];
            }
        }
    }
    public void moveLeft(){
        for (int row = 0; row < FIL; row++) {
            int[] newRow = new int[FIL];
            int pos = 0;

            // Shift non-zero elements to newRow
            for (int col = 0; col < FIL; col++) {
                if (board[row][col] != 0) {
                    newRow[pos++] = board[row][col];
                }
            }

            // Combine adjacent equal elements
            for (int col = 0; col < FIL - 1; col++) {
                if (newRow[col] != 0 && newRow[col] == newRow[col + 1]) {
                    newRow[col] *= 2;
                    newRow[col + 1] = 0;
                }
            }

            // Shift elements again after combining
            pos = 0;
            for (int col = 0; col < FIL; col++) {
                if (newRow[col] != 0) {
                    board[row][pos++] = newRow[col];
                } else {
                    board[row][pos++] = 0;
                }
            }
        }
    }

    public void addRandomNumber(){
//        if (!canAddRandom(matrix)) {
//            return;
//        }
        Random r = new Random();

        // int row = r.nextInt(FIL);
        int row = (int) (Math.random() * FIL);
        int col = r.nextInt(COL);

        while (board[row][col] != 0) {
            row = r.nextInt(FIL);
            col = r.nextInt(COL);
        }

        // board[row][col] = Math.random() < 0.9 ? 2 : 4;
        if (Math.random() < 0.9) {
            board[row][col] = 2;
        }
        else{
            board[row][col] = 4;
        }
    }
}