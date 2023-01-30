import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputLine = scanner.nextLine().split(" ");
        String firstString = inputLine[0];
        String secondString = inputLine[1];

        int results = sumChars(firstString, secondString);
        System.out.println(results);
    }


    public static int sumChars (String string1, String string2) {

    int smallerLength = 0;
    int result = 0;
    boolean areEven = false;
    String biggerLength = "";

    if (string1.length() == string2.length()) {
        smallerLength = string1.length();
        areEven = true;
    }
    else if (string1.length() > string2.length()) {
        smallerLength = string2.length();
        biggerLength = string1;
    } else {
        smallerLength = string1.length();
        biggerLength = string2;
    }

        for (int i = 0; i < smallerLength; i++) {
            char char1 = string1.charAt(i);
            char char2 = string2.charAt(i);
            int multiplication = char1 * char2;
            result += multiplication;
        }

    if (!areEven) {
        for (int i = smallerLength; i < biggerLength.length(); i++) {
            char currentChar = biggerLength.charAt(i);
            result += currentChar;
        }
    }
    return result;
    }
}
