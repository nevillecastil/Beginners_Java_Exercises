import java.util.Scanner;

public class SOSgame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[][] board = new char[10][10];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = '.';
            }
        }

        int count = 0;
        while (count < 6) {
            if (count % 2 == 0) {
                System.out.println("Player 1");
            } else {
                System.out.println("Player 2");
            }

            System.out.println("Please enter a row (0-9)");
            int r = input.nextInt();
            System.out.println("Please enter a col (0-9)");
            int c = input.nextInt();
            System.out.println("Would you like an 'S' or an 'O'?");
            char guess = input.next().charAt(0);
            board[r][c] = guess;
            count++;
            printBoard(board);
        }
        input.close();
    }

    public static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}
