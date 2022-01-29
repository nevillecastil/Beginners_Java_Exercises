
/*
This is an one player version and we will start with our ships in set positions. 
This makes it easy for you in testing your program.
Battleship starts with two boards for a player.
There is a board with the ships location, and a second board for the players guesses.
Each guess is marked at a “hit” or a “miss”.  On the final hit on a ship, the guesser is told that they have sunk the ship.
 */
import java.util.Scanner;

public class BattleShip1 {
    public static void main(String[] args) {
        System.out.println("Battleship Game\n");
        System.out.println("Sunk enemy's Patrol Boat, Destroyer and Battleship\n");
        System.out.println("ENEMY Board\n");
        Scanner input = new Scanner(System.in);
        char[] letters = { ' ', 'A', 'B', 'C', 'D', 'E', 'F' };
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6 };
        /*
         * char[][] guesses = {
         * {'o','1','2','3','4','5','6'},
         * {'A','x','o','o','o','o','o'},
         * {'B','x','o','o','o','x','o'},
         * {'C','o','o','o','o','x','o'},
         * {'D','o','o','o','o','x','o'},
         * {'E','o','o','o','o','o','o'},
         * {'F','o','o','x','x','x','x'}
         * };
         */

        char[][] ships = new char[7][7];
        for (int row = 0; row < ships.length; row++) {
            for (int col = 0; col < ships[0].length; col++) {
                if (row == 0)
                    System.out.print(numbers[col]);
                else if (col == 0)
                    System.out.print(letters[row]);
                else
                    System.out.print(ships[row][col] = '.');
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        int Patrol = 0;
        int Destroyer = 0;
        int Battleship = 0;
        int count = 0;
        do {
            int r = 0, c = 0;
            System.out.println("Please enter a guess in the form 'B5':");
            String g = input.next();
            g = g.toLowerCase();
            switch (g.charAt(0)) {
                case 'a':
                    r = 1;
                    break;
                case 'b':
                    r = 2;
                    break;
                case 'c':
                    r = 3;
                    break;
                case 'd':
                    r = 4;
                    break;
                case 'e':
                    r = 5;
                    break;
                case 'f':
                    r = 6;
                    break;
            }

            switch (g.charAt(1)) {
                case '1':
                    c = 1;
                    break;
                case '2':
                    c = 2;
                    break;
                case '3':
                    c = 3;
                    break;
                case '4':
                    c = 4;
                    break;
                case '5':
                    c = 5;
                    break;
                case '6':
                    c = 6;
                    break;
            }

            if ((r == 1 && c == 1) || (r == 2 && c == 1)) {
                ships[r][c] = 'x';
                Patrol++;
                count++;
                System.out.println();
                System.out.println("ENEMY Board");
                System.out.println();
                System.out.println(g.toUpperCase() + " is a hit");
                System.out.println();
                printBoard(ships);
                if (Patrol == 2) {
                    System.out.println();
                    System.out.println("You sunk the Patrol Boat!!");
                    System.out.println();
                }
                System.out.println();
                continue;
            }

            if ((r == 2 && c == 5) || (r == 3 && c == 5) || (r == 4 && c == 5)) {
                ships[r][c] = 'x';
                Destroyer++;
                count++;
                System.out.println();
                System.out.println("ENEMY Board");
                System.out.println();
                System.out.println(g.toUpperCase() + " is a hit");
                System.out.println();
                printBoard(ships);
                if (Destroyer == 3) {
                    System.out.println();
                    System.out.println("You sunk the Destroyer!!");
                    System.out.println();
                }
                System.out.println();
                continue;
            }

            if ((r == 6 && c == 3) || (r == 6 && c == 4) || (r == 6 && c == 5) || (r == 6 && c == 6)) {
                ships[r][c] = 'x';
                Battleship++;
                count++;
                System.out.println();
                System.out.println("ENEMY Board");
                System.out.println();
                System.out.println(g.toUpperCase() + " is a hit");
                System.out.println();
                printBoard(ships);
                if (Battleship == 4) {
                    System.out.println();
                    System.out.println("You sunk the Battleship!!");
                    System.out.println();
                }
                System.out.println();
                continue;
            } else {
                ships[r][c] = 'o';
                System.out.println();
                System.out.println("ENEMY Board");
                System.out.println();
                System.out.println(g.toUpperCase() + " is a miss");
                System.out.println();
                printBoard(ships);
                System.out.println();
            }
        } while (count < 9);
        System.out.print("Game over, You Win!");

        input.close();
    }

    public static void printBoard(char[][] ships) {
        char[] letters = { ' ', 'A', 'B', 'C', 'D', 'E', 'F' };
        int[] numbers = { 0, 1, 2, 3, 4, 5, 6 };
        for (int row = 0; row < ships.length; row++) {
            for (int col = 0; col < ships[0].length; col++) {
                if (row == 0) {
                    System.out.print(numbers[col] + " ");
                } else if (col == 0) {
                    System.out.print(letters[row] + " ");
                } else {
                    System.out.print(ships[row][col] + " ");
                }
            }
            System.out.println();
        }
    }
}
