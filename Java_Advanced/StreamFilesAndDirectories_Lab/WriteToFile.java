package Lab_Solutions;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class WriteToFile {
    public static void main(String[] args) throws RuntimeException, IOException {

        String basePath = "C:\\Users\\USER\\Desktop\\Softuni-Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\output.txt";

        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');
        OutputStream out = new FileOutputStream(outputPath);

        try (InputStream in = new FileInputStream(inputPath)) {
            int nextByte = in.read();

            while (nextByte >= 0) {

                if (!punctuation.contains((char)nextByte))
                    out.write(nextByte);
                nextByte = in.read();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        out.close();
    }
}
