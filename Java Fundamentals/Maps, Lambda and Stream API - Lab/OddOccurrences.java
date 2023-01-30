import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");
        LinkedHashMap <String, Integer> wordMap = new LinkedHashMap<>();

        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            wordMap.putIfAbsent(lowerCaseWord, 0);
            wordMap.put(lowerCaseWord, wordMap.get(lowerCaseWord) + 1);
        }

        ArrayList<String> odds = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            int currentCount = entry.getValue();

            if (currentCount % 2 != 0) {
                odds.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", odds));
    }
}
