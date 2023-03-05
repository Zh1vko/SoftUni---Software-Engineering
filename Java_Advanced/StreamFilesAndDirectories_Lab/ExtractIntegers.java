package Lab_Solutions;

import java.io.*;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String basePath = "C:\\Users\\USER\\Desktop\\Softuni-Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\ExtractIntegers_output.txt";

        InputStream in = new FileInputStream(inputPath);
        PrintStream out = new PrintStream(new FileOutputStream(outputPath));

        Scanner scanner = new Scanner(in);

        while (scanner.hasNext()) {

            if (scanner.hasNextInt()) {
                out.println(scanner.nextInt());
            }
            scanner.next();
        }

        out.close();
    }
}
