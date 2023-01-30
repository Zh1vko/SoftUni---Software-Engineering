import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String integer = "";
        String words = "";
        String leftover = "";

        for (int i = 0; i < input.length(); i++) {

            char currentChar = input.charAt(i);

            if (Character.isLetter(currentChar)) {
                words += currentChar;
            }
            else if (Character.isDigit(currentChar)) {
                integer += currentChar;
            } else {
                leftover += currentChar;
            }

        }

        System.out.println(integer);
        System.out.println(words);
        System.out.println(leftover);
    }
}
