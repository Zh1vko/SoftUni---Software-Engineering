import java.util.Scanner;

public class passwordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 6 – 10 characters (inclusive);
        // Consists only of letters and digits;
        // Have at least 2 digits.

        String passwordInput = scanner.nextLine();
        passValidator(passwordInput);
    }

    public static void passValidator (String input) {

        boolean requiredLength = false;
        boolean lettersAndDigitsOnly = true;
        boolean minDigits = false;
        int digitCounter = 0;

        if (input.length() >= 6 && input.length() <= 10) {
            requiredLength = true;
        }

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!Character.isLetterOrDigit(currentChar)) {
                lettersAndDigitsOnly = false;
            }
        }

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isDigit(currentChar)) {
                digitCounter++;
            }
        }
        if (digitCounter >= 2) {
            minDigits = true;
        }

        if (requiredLength && lettersAndDigitsOnly && minDigits) {
            System.out.println("Password is valid");
        }
        if (!requiredLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!lettersAndDigitsOnly) {
            System.out.println("Password must consist only of letters and digits");
        }
        if (!minDigits) {
            System.out.println("Password must have at least 2 digits");
        }
    }
}
