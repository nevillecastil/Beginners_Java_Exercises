/*For loops to output asterisks (*) in the shape of a large ‘X’ or ‘O’ .
Program ask the user whether they want to see an ‘X’ or an ‘O’,
and what size it should be.*/

import java.util.Scanner;

public class ShapeswithForLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = -1;
        System.out.println("Would you like to see an X or O?");
        char shape = input.next().charAt(0);
        System.out.println("What size should it be?");
        size = input.nextInt();

        if (shape == 'X') {
            for (int row = 0; row < size; row++) {
                for (int col = 0; col < size; col++) {
                    if (row == col || (row + col) == (size - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            for (int row = 1; row <= size; row++) {
                for (int col = 1; col <= size; col++) {
                    if (row == 1 || col == 1 || row == size || col == size) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        input.close();
    }
}
