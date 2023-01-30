import java.util.*;
import java.util.stream.Collectors;

public class randomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> wordsList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        Random randomWord = new Random();

        for (int i = 0; i < wordsList.size(); i++) {
            int firstIndex = randomWord.nextInt(wordsList.size());
            int secondIndex = randomWord.nextInt(wordsList.size());

            String tempWord = wordsList.get(firstIndex);
            wordsList.set(firstIndex, wordsList.get(secondIndex));
            wordsList.set(secondIndex, tempWord);
        }

        for (String item:
             wordsList) {
            System.out.println(item);
        }
    }
}
