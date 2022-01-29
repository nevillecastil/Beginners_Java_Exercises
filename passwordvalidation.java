
/*
Program to validate passwords for users, making sure they meet the following criteria:
•	Passwords must be at least 8 characters long
•	Passwords can only contain alpha numeric characters (no spaces or special characters)
•	Passwords must contain at least 1 uppercase character
•	Passwords must contain at least 1 lowercase character
•	Passwords must contain at least 1 numeric character (0-9)
•	Passwords cannot contain the word “password”
A password that does not meet all of these rules must list each rule that it breaks.
You must repeatedly ask the user for a password until the user enters “endofinput”
 */
import java.util.Scanner;

public class passwordvalidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Password: ");
        String pwd = input.nextLine();
        while (!pwd.equals("endofinput")) {
            if (psize(pwd) & isAlphaNum(pwd) & isDigit(pwd) & hasUpper(pwd) & hasLow(pwd) & !hasWord(pwd)) {
                System.out.println("Your password is valid");

            }
            System.out.print("Password: ");
            pwd = input.next();
        }
        input.close();
    }

    public static boolean psize(String p) {
        if (p.length() < 8) {
            System.out.println("Your password must be at least 8 characters");
            return false;
        }
        return true;
    }

    public static boolean isDigit(String p) {
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (Character.isDigit(c))
                return true;
        }
        System.out.println("Your password must contain a number.");
        return false;
    }

    public static boolean hasUpper(String p) {
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (Character.isUpperCase(c))
                return true;
        }
        System.out.println("Your password must contain at least one uppercase letter.");
        return false;
    }

    public static boolean isAlphaNum(String p) {
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (!Character.isLetterOrDigit(c)) {
                System.out.println("Your password can only contain alpha numeric characters.");
                return false;
            }
        }
        return true;
    }

    public static boolean hasWord(String p) {
        p = p.toLowerCase();
        int i = p.indexOf("password");
        if (i == -1)
            return false;
        System.out.println("Your password cannot contain the word 'password'.");
        return true;
    }

    public static boolean hasLow(String p) {
        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);
            if (Character.isLowerCase(c))
                return true;
        }
        System.out.println("Your password must contain at least one lowercase letter.");
        return false;
    }
}