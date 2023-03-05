package Lab_Solutions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class SortLines {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\USER\\Desktop\\Softuni-Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\SortLines_Output.txt";

        Path path = Paths.get(inputPath);
        List<String> sortedLines = Files.readAllLines(path);

       sortedLines =  sortedLines.stream()
                .sorted()
                .collect(Collectors.toList());

        Path output = Paths.get(outputPath);
        Files.write(output, sortedLines);
    }
}
