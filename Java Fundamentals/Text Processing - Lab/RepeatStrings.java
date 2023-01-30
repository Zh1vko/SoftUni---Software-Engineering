import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] stringArray = scanner.nextLine().split(" ");
        String result = "";

        for (int i = 0; i < stringArray.length; i++) {
            String currentWord = stringArray[i];
            int wordLength = currentWord.length();



            for (int j = 0; j < wordLength; j++) {
                result += currentWord;
            }

        }
        System.out.println(result);
    }
}
