import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesList = scanner.nextLine().split(", ");

        //•	Has a length of between 3 and 16 characters.
        //•	It contains only letters, numbers, hyphens(-), and underscores(_).

        List<String> validList = new ArrayList<>();

        for (int i = 0; i < namesList.length; i++) {
            String currentWord = namesList[i];
            boolean isValid = true;

            if (currentWord.length() >= 3 && currentWord.length() <= 16) {
                for (int j = 0; j < currentWord.length(); j++) {
                    char currentChar = currentWord.charAt(j);

                    if (!Character.isDigit(currentChar) && !Character.isLetter(currentChar) && currentChar != 45 && currentChar != 95) {
                        isValid = false;
                    }
                }
            } else {
                isValid = false;
            }

            if (isValid) {
                validList.add(currentWord);
            }
        }

        for (String entry : validList) {
            System.out.printf("%s%n", entry);
        }





    }
}
