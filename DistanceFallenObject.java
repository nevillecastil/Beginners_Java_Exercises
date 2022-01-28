/*Compute how far an object has fallen in a given amount of time*/

import java.util.Scanner;

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
