import java.util.Scanner;

public class middleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        characterChecker(input);

    }
    public static void characterChecker (String textInput) {
       if (textInput.length() % 2 == 0) {
           int charPosition = textInput.length() / 2;
           System.out.print(textInput.charAt(charPosition-1));
           System.out.print(textInput.charAt(charPosition));
       } else {
            int charPosition = (textInput.length() / 2);
           System.out.print(textInput.charAt(charPosition));
       }
    }
}
