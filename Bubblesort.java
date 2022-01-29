
/*
Sort both integers and doubles by overloading a method.
 */
import java.util.Scanner;
import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the # of numbers to be sorted: ");
        int num = input.nextInt();
        System.out.println("Enter 1 for int's or 2 for doubles: ");
        int type = input.nextInt();

        int[] a = new int[num];
        double[] b = new double[num];
        if (type == 1) {
            for (int i = 0; i < a.length; i++) {
                System.out.println("Enter number: ");
                a[i] = input.nextInt();
            }
            bubbleSort(a);
        } else {
            for (int i = 0; i < b.length; i++) {
                System.out.println("Enter number: ");
                b[i] = input.nextDouble();
            }
            bubbleSort(b);
        }
        input.close();
    }

    public static void bubbleSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 1; j < a.length - i; j++) {
                if (a[j - 1] > a[j]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(a).replace("[", "").replace("]", ""));
        }
    }

    public static void bubbleSort(double[] b) {
        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 1; j < b.length - i; j++) {
                if (b[j - 1] > b[j]) {
                    double temp = b[j];
                    b[j] = b[j - 1];
                    b[j - 1] = temp;
                }
            }
            System.out.println(Arrays.toString(b).replace("[", "").replace("]", ""));
        }
    }
}
