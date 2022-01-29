
/*You must take in a line of text from the user, and output the following:
•	The sum of the digits in the string
•	The number of letters in the string
•	The number of vowels in the string
•	Whether or not the sentence contains all the letters of the word “awesome”
*/
import java.util.Scanner;

public class stringinfo {
    public static void main(String[] args) {
        System.out.println("Please enter a sentence to analyze:");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        sentence = sentence.toLowerCase();

        System.out.println("The number of letters is: " + numLetters(sentence));
        System.out.println("The number of vowels is: " + numVowels(sentence));
        System.out.println("The sum of digits is: " + sumDigits(sentence));
        System.out.println(aweSome(sentence));
        input.close();
    }

    public static int numLetters(String sentence) {
        int countNum = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) != ' ' & !Character.isDigit(sentence.charAt(i))
                    & Character.isLetter(sentence.charAt(i))) {
                countNum++;
            }
        }
        return countNum;
    }

    public static int numVowels(String sentence) {
        int countVow = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
                    || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                countVow++;
            }
        }
        return countVow;
    }

    public static int sumDigits(String sentence) {
        int sum = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isDigit(sentence.charAt(i))) {
                sum = sum + Character.getNumericValue(sentence.charAt(i));
            }
        }
        return sum;
    }

    public static String aweSome(String sentence) {
        int counte = 0, counta = 0, countw = 0, counts = 0, counto = 0, countm = 0;
        String x = "The sentence is awesome";
        String y = "The sentence is not awesome";
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'e') {
                counte++;
            } else if (sentence.charAt(i) == 'a') {
                counta++;
            } else if (sentence.charAt(i) == 'w') {
                countw++;
            } else if (sentence.charAt(i) == 's') {
                counts++;
            } else if (sentence.charAt(i) == 'o') {
                counto++;
            } else if (sentence.charAt(i) == 'm') {
                countm++;
            }
        }

        if (counte > 1 && counta > 0 && countw > 0 && counts > 0 && counto > 0 && countm > 0) {
            return x;
        }
        return y;
    }
}
