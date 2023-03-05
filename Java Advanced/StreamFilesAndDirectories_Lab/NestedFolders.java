package Lab_Solutions;

import java.io.File;
import java.io.FilePermission;

public class NestedFolders {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\USER\\Desktop\\Softuni-Advanced\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams";

        File file = new File(basePath);
        File[] nestedFiles = file.listFiles();

        int folderCount = 0;

        for (File currentFile : nestedFiles) {


            if (currentFile.isDirectory()) {
                System.out.println(currentFile.getName());
                folderCount++;

             File[] insideFiles = currentFile.listFiles();

             for (File insideFile : insideFiles) {
                 if (insideFile.isDirectory()) {
                     folderCount++;
                     System.out.println(insideFile.getName());

                     File[] evenMoreNested = insideFile.listFiles();
                     for (File moreNested : evenMoreNested) {

                         if (moreNested.isDirectory()) {
                             folderCount++;
                             System.out.println(moreNested.getName());
                         }
                     }

                 }
             }

            }



        }

        System.out.println(folderCount);
    }
}
