import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] line = scanner.nextLine().split("");
        String concatLine = "";

        for (String entry : line) {
            concatLine += entry;
        }

        List<Character> modifiedList = new ArrayList<>();

        for (int i = 0; i < concatLine.length(); i++) {
            char currentChar = concatLine.charAt(i);
            char newChar = (char) (currentChar + 3);
            modifiedList.add(newChar);

        }

        for (char current : modifiedList) {
            System.out.printf("%c", current);
        }
    }
}
