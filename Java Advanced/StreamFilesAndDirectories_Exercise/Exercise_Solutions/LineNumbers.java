package Exercise_Solutions;

import java.io.*;

public class LineNumbers {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\USER\\IdeaProjects\\StreamFilesAndDirectories\\src\\Exercise_Resources\\inputLineNumbers.txt";

        try (BufferedReader in = new BufferedReader(new FileReader(basePath));
            PrintWriter out = new PrintWriter("LineNumbers_output.txt")) {

                String line = in.readLine();
                int lineCounter = 0;

                while (line != null) {
                    lineCounter++;


                    out.println(lineCounter + ". " + line);
                    line = in.readLine();
                }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
