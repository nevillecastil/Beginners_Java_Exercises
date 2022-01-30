import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = { 50, 20, 3, 44, 97, 42, 2, 19, 77, 32, 99 };

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        int index = Arrays.binarySearch(numbers, 99);
        System.out.println("Index of the value is " + index);

    }
}
