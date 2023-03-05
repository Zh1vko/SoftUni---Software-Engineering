package Exercise_Solutions;

import java.io.*;
import java.nio.file.Paths;

public class MergeTwoFiles {
    public static void main(String[] args) {

        String inputOnePath = "C:\\Users\\USER\\IdeaProjects\\StreamFilesAndDirectories\\src\\Exercise_Resources\\inputOne.txt";
        String inputTwoPath = "C:\\Users\\USER\\IdeaProjects\\StreamFilesAndDirectories\\src\\Exercise_Resources\\inputTwo.txt";

       try (BufferedReader readerOne = new BufferedReader(new FileReader(inputOnePath));
            BufferedReader readerTwo = new BufferedReader(new FileReader(inputTwoPath));
            PrintWriter writer = new PrintWriter("MergedOutput.txt")) {

           String firstLine = readerOne.readLine();
           while (firstLine != null) {

                writer.println(firstLine);

               firstLine = readerOne.readLine();
           }

               firstLine = readerTwo.readLine();            // After all inputs from 1st file are done -> continue with inputs from 2nd file.
               while (firstLine != null) {

                   writer.println(firstLine);

                   firstLine = readerTwo.readLine();
               }



       } catch (IOException e) {
           throw new RuntimeException(e);
       }
    }
}
