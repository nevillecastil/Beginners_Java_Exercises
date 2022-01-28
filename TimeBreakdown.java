import java.util.Scanner;

public class TimeBreakdown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the time in seconds");
        int time = input.nextInt();

        int hours = time / (60 * 60);
        int leftover = time % (60 * 60);
        int minutes = leftover / 60;
        int seconds = leftover % 60;

        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
        input.close();

    }
}
