package Exercise_Solutions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\USER\\IdeaProjects\\StreamFilesAndDirectories\\src\\Exercise_Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(basePath));

        int sum = 0;
        for (String line : allLines) {


            for (char symbol : line.toCharArray()) {
                sum += (int) symbol;
            }
        }

        System.out.println(sum);
    }
}
