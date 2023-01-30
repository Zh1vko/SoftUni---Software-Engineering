import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap <String, ArrayList<String>> wordsList = new LinkedHashMap<>();



        for (int i = 0; i < n; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            wordsList.putIfAbsent(key, new ArrayList<>());
            wordsList.get(key).add(value);
        }

        for (Map.Entry<String, ArrayList<String>> entry : wordsList.entrySet()) {
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
