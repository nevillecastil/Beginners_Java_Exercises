
/*Code provided by Ken Chidlow*/

import java.util.Scanner;

public class CrapsUpgradedCode {
    public static void main(String[] args) {
        int roll = 0;
        int point = 8;
        Scanner input = new Scanner(System.in);
        do {
            int d1 = (int) (Math.random() * 6 + 1);
            int d2 = (int) (Math.random() * 6 + 1);
            roll = d1 + d2;
            System.out.println("Roll is " + roll);
        } while (roll != 7 && roll != point);

        int number = 0;
        do {
            number = input.nextInt();
        } while (number != 0);
        input.close();
    }
}
