package Lab_Solutions;

import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws FileNotFoundException {

        String basePath = "C:\\Users\\USER\\Desktop\\Softuni-Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\EveryThirdLine_output.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        PrintWriter writer = new PrintWriter(new PrintWriter(outputPath))) {

            String line = reader.readLine();
            int lineCounter = 1;

            while (line != null) {

                if (lineCounter % 3 == 0) {
                    writer.println(line);
                }

                lineCounter++;
                line = reader.readLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
