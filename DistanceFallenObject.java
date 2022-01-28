import java.util.Scanner;

/**
 * Neville Castillo
 * 300321642
 * COSC 111 Lab 1
 */
public class DistanceFallenObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of time in seconds that the object was falling for: ");
        double time = input.nextDouble();
        double distance = 0.5 * (9.81 * time * time);
        double feet = 3.28 * distance;
        System.out.println("The object's position after 10.0 seconds is " + distance + " or " + feet + " feet ");
        input.close();

    }
}
