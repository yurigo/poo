import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int SIZE = 4;
    public static Random r = new Random();

    public static void main(String[] args) {
        int[][] matrix = new int[SIZE][SIZE];

        addRandom(matrix);
        addRandom(matrix);

        Scanner sc = new Scanner(System.in);
        System.out.println("Usa las teclas A/S/D/W");
        System.out.println("Presiona 'q' para salir");


        while (true) {

            printMatrix(matrix);
            char c = sc.next().charAt(0);
            if (c == 'q') {
                break;
            }

            matrix = play(matrix, c);

            addRandom(matrix);

            if (checkMatrix(matrix)) {
                System.out.println("Fin del juego");
                printMatrix(matrix);
                break;
            }

            System.out.println("Tecla presionada: " + c);
        }

        sc.close();
    }

    public static void addRandom(int[][] matrix) {
        if (!canAddRandom(matrix)) {
            return;
        }

        int row = r.nextInt(SIZE);
        int col = r.nextInt(SIZE);

        while (matrix[row][col] != 0) {
            row = r.nextInt(SIZE);
            col = r.nextInt(SIZE);
        }

        matrix[row][col] = Math.random() < 0.9 ? 2 : 4;
    }

    public static boolean canAddRandom(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[][] play(int[][] matrix, char c) {
        int[][] newMatrix = copyMatrix(matrix);

        switch (c) {
            case 'w':
                moveUp(newMatrix);
                break;
            case 's':
                moveDown(newMatrix);
                break;
            case 'a':
                moveLeft(newMatrix);
                break;
            case 'd':
                moveRight(newMatrix);
                break;
        }

        return newMatrix;
    }

    static public void moveLeft(int[][] matrix) {
        for (int row = 0; row < SIZE; row++) {
            int[] newRow = new int[SIZE];
            int pos = 0;

            // Shift non-zero elements to newRow
            for (int col = 0; col < SIZE; col++) {
                if (matrix[row][col] != 0) {
                    newRow[pos++] = matrix[row][col];
                }
            }

            // Combine adjacent equal elements
            for (int col = 0; col < SIZE - 1; col++) {
                if (newRow[col] != 0 && newRow[col] == newRow[col + 1]) {
                    newRow[col] *= 2;
                    newRow[col + 1] = 0;
                }
            }

            // Shift elements again after combining
            pos = 0;
            for (int col = 0; col < SIZE; col++) {
                if (newRow[col] != 0) {
                    matrix[row][pos++] = newRow[col];
                } else {
                    matrix[row][pos++] = 0;
                }
            }
        }
    }

    static public void moveUp(int[][] matrix) {
        for (int col = 0; col < SIZE; col++) {
            int[] newCol = new int[SIZE];
            int pos = 0;

            // Shift non-zero elements to newCol and combine adjacent equal elements
            for (int row = 0; row < SIZE; row++) {
                if (matrix[row][col] != 0) {
                    if (pos > 0 && newCol[pos - 1] == matrix[row][col]) {
                        newCol[pos - 1] *= 2;
                    } else {
                        newCol[pos++] = matrix[row][col];
                    }
                }
            }

            // Copy newCol back to the original matrix column
            for (int row = 0; row < SIZE; row++) {
                matrix[row][col] = newCol[row];
            }
        }
    }

    static public void moveRight(int[][] matrix) {
        for (int row = 0; row < SIZE; row++) {
            int[] newRow = new int[SIZE];
            int pos = SIZE - 1;

            // Shift non-zero elements to newRow and combine adjacent equal elements
            for (int col = SIZE - 1; col >= 0; col--) {
                if (matrix[row][col] != 0) {
                    if (pos < SIZE - 1 && newRow[pos + 1] == matrix[row][col]) {
                        newRow[pos + 1] *= 2;
                    } else {
                        newRow[pos--] = matrix[row][col];
                    }
                }
            }

            // Copy newRow back to the original matrix row
            for (int col = 0; col < SIZE; col++) {
                matrix[row][col] = newRow[col];
            }
        }
    }

    static public void moveDown(int[][] matrix) {
        for (int col = 0; col < SIZE; col++) {
            int[] newCol = new int[SIZE];
            int pos = SIZE - 1;

            // Shift non-zero elements to newCol and combine adjacent equal elements
            for (int row = SIZE - 1; row >= 0; row--) {
                if (matrix[row][col] != 0) {
                    if (pos < SIZE - 1 && newCol[pos + 1] == matrix[row][col]) {
                        newCol[pos + 1] *= 2;
                    } else {
                        newCol[pos--] = matrix[row][col];
                    }
                }
            }

            // Copy newCol back to the original matrix column
            for (int row = 0; row < SIZE; row++) {
                matrix[row][col] = newCol[row];
            }
        }
    }

    public static int[][] copyMatrix(int[][] matrix) {
        int[][] newMatrix = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMatrix[i][j] = matrix[i][j];
            }
        }

        return newMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkMatrix(int[][] matrix) {
        return checkWin(matrix) || checkGameOver(matrix);
    }

    public static boolean checkWin(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 2048) {
                    System.out.println("¡Ganaste!");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkGameOver(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    return false;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] == matrix[i][j + 1]) {
                    return false;
                }
            }
        }

        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == matrix[i + 1][j]) {
                    return false;
                }
            }
        }

        System.out.println("¡Perdiste!");
        return true;

    }

}