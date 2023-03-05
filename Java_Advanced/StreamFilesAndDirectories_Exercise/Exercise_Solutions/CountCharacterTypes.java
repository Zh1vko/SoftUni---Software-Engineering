package Exercise_Solutions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {

        int vowels = 0;
        int otherSymbols = 0;
        int punctuations = 0;

        String basePath = "C:\\Users\\USER\\IdeaProjects\\StreamFilesAndDirectories\\src\\Exercise_Resources\\input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(basePath));

        List<String> allLines = Files.readAllLines(Paths.get(basePath));

        for (String line : allLines) {

            for (char symbol : line.toCharArray()) {

                if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u') {
                    vowels++;
                } else if (symbol == '.' || symbol == ',' || symbol == '!' || symbol == '?') {
                    punctuations++;
                } else if (symbol != ' '){
                    otherSymbols++;
                }

            }

        }

        System.out.printf("Vowels: %d%n", vowels);
        System.out.printf("Other symbols: %d%n", otherSymbols);
        System.out.printf("Punctuation: %d", punctuations);
    }
}
