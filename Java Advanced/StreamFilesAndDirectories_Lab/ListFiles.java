package Lab_Solutions;

import java.io.File;

public class ListFiles {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\USER\\Desktop\\Softuni-Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(basePath);
        File[] nestedFile = file.listFiles();

        for (File currentFile : nestedFile) {
            if (currentFile.isFile()) {
                System.out.printf("%s: [%d]%n", currentFile.getName(), currentFile.length());
            }
        }

    }
}
