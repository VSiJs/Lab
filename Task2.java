package Lab5;
import java.util.Scanner;

public class Task2 {
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        initializeBoard();
        boolean gameFinished = false;

        while (!gameFinished) {
            printBoard();
            int[] move = getPlayerMove();
            int row = move[0];
            int col = move[1];

            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer;
                gameFinished = checkForWin(row, col);
                if (gameFinished) {
                    printBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                } else {
                    if (isBoardFull()) {
                        printBoard();
                        System.out.println("It's a draw!");
                        gameFinished = true;
                    } else {
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    }
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = ' ';
            }
        }
    }

    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("| ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    private static int[] getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int[] move = new int[3];

        System.out.print("Player " + currentPlayer + ", enter row (0-2): ");
        move[0] = scanner.nextInt();
        System.out.print("Player " + currentPlayer + ", enter column (0-2): ");
        move[1] = scanner.nextInt();

        return move;
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == ' ';
    }

    private static boolean checkForWin(int row, int col) {
        return checkRow(row) || checkColumn(col) || checkDiagonal() || checkAntiDiagonal();
    }

    private static boolean checkRow(int row) {
        return board[row][0] == currentPlayer && board[row][1] == currentPlayer && board[row][2] == currentPlayer;
    }

    private static boolean checkColumn(int col) {
        return board[0][col] == currentPlayer && board[1][col] == currentPlayer && board[2][col] == currentPlayer;
    }

    private static boolean checkDiagonal() {
        return board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer;
    }

    private static boolean checkAntiDiagonal() {
        return board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}
