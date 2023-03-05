package Exercise_Solutions;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {

        String wordsPath = "C:\\Users\\USER\\IdeaProjects\\StreamFilesAndDirectories\\src\\Exercise_Resources\\words.txt";
        String textPath = "C:\\Users\\USER\\IdeaProjects\\StreamFilesAndDirectories\\src\\Exercise_Resources\\text.txt";

       List<String> allLinesWithWords = Files.readAllLines(Path.of(wordsPath));
       Map<String, Integer> wordsCount = new LinkedHashMap<>();

       for (String line : allLinesWithWords)  {                     // Put key word values in a map to track occurrences.
           String[] wordsOnLine = line.split("\\s+");
           Arrays.stream(wordsOnLine).forEach(e -> {
               wordsCount.put(e, 0);
           });
       }


       List <String> allText = Files.readAllLines(Paths.get(textPath));         // Check the text for any match of keywords and add occurrences.
       for (String line : allText) {
           line = line.replace("[\\.\\,\\?\\!\\:]", "");            // Make sure words are separate, without punctuations.
           String[] words = line.split("\\s+");

           for (String word : words) {
               if (wordsCount.containsKey(word)) {
                   wordsCount.put(word, wordsCount.get(word)+1);
               }
           }
       }


       PrintWriter writer = new PrintWriter("WordCount_Results");

       wordsCount.entrySet().stream()            // Stream all entries -> Sort values in descending order -> Add to file in specific format.
               .sorted((element1, element2) -> element2.getValue().compareTo(element1.getValue()))
               .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));

       writer.close();

    }
}
