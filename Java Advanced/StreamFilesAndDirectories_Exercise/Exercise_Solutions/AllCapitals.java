package Exercise_Solutions;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class AllCapitals {
    public static void main(String[] args) throws IOException {

        String basePath = "C:\\Users\\USER\\IdeaProjects\\StreamFilesAndDirectories\\src\\Exercise_Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(basePath));

        BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));


        for (String line : allLines) {

          line = line.toUpperCase();

          out.write(line);
          out.newLine();
        }

        out.close();

    }
}
