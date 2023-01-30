import java.util.Scanner;

public class vowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println(vowelCheck(input));
    }
    public static int vowelCheck (String textInput) {
        int vowelCount = 0;                                                     // vowel counter


        for (int i = 0; i < textInput.length(); i++) {
            char currentChar = textInput.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
            if (currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U') {
                vowelCount++;
            }
        }
        return vowelCount;
    }
}
