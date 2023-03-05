package Lab_Solutions;

import java.io.*;

public class CopyBytes {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\USER\\Desktop\\Softuni-Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\CopyBytes_output.txt";

        try (InputStream in = new FileInputStream(inputPath); OutputStream out = new FileOutputStream(outputPath)) {
             int nextByte = in.read();

             while (nextByte >= 0)  {

                 if (nextByte == ' ' || nextByte == '\n') {
                     out.write(nextByte);
                 } else {
                    String number = String.valueOf(nextByte);

                     for (int i = 0; i < number.length(); i++) {
                         char currentNumber = number.charAt(i);
                         out.write(currentNumber);
                     }
                 }

                 nextByte = in.read();
             }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
