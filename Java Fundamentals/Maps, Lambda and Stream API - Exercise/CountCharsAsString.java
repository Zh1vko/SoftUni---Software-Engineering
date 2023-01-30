import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsAsString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] wordsArr = scanner.nextLine().split(" ");
        LinkedHashMap<Character, Integer> chars = new LinkedHashMap<>();

        for (int i = 0; i < wordsArr.length; i++) {
            String currentWord = wordsArr[i];

            for (int j = 0; j < currentWord.length(); j++) {
                char currentChar = currentWord.charAt(j);
                chars.putIfAbsent(currentChar, 0);
                chars.put(currentChar, chars.get(currentChar) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
