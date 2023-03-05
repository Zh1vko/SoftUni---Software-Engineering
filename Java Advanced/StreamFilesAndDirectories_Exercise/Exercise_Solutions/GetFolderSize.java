package Exercise_Solutions;

import java.io.File;
import java.nio.file.Paths;

public class GetFolderSize {
    public static void main(String[] args) {

        String folderPath = "C:\\Users\\USER\\IdeaProjects\\StreamFilesAndDirectories\\src\\Exercise_Resources\\Exercises Resources";

        File folder = new File(folderPath);
        File[] allFiles = folder.listFiles();       // Add all the files in the specific folder
        int folderSize = 0;


        if (allFiles != null) {         // Make sure folder is not empty
            for (File currentFile : allFiles) {
                folderSize += currentFile.length();
            }
        }

        System.out.printf("Folder size: %d", folderSize);

    }
}
