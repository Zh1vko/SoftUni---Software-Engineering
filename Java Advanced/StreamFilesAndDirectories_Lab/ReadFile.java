package Lab_Solutions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    public static void main(String[] args) {
        String inputPath = "C:\\Users\\USER\\Desktop\\Softuni-Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        try (InputStream in = new FileInputStream(inputPath)) {
                int nextByte = in.read();

                while (nextByte >= 0) {
                    System.out.printf("%s ", Integer.toBinaryString(nextByte));

                    nextByte = in.read();
                }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
