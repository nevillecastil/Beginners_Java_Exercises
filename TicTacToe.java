/*Code provide by Ken Chidlow*/
public class TicTacToe {
    public static void main(String[] args) {
        char[][] tictactoe = new char[3][3];

        for (int row = 0; row < tictactoe.length; row++) {
            for (int col = 0; col < tictactoe[0].length; col++) {
                tictactoe[row][col] = '.';
            }

        }

        tictactoe[0][2] = 'x';
        tictactoe[2][0] = '0';
        tictactoe[2][2] = 'x';
        tictactoe[1][2] = '0';
        tictactoe[0][0] = 'x';

        for (int row = 0; row < tictactoe.length; row++) {
            for (int col = 0; col < tictactoe[0].length; col++) {
                System.out.print(tictactoe[row][col] + " ");
            }
            System.out.println();
        }

    }
}
