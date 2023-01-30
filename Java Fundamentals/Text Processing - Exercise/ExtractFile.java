import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputLine = input.split("\\\\");
        String finalWord = inputLine[inputLine.length-1];
        String[] fileInfo = finalWord.split("\\.");

        String word = fileInfo[0];
        String extension = fileInfo[1];

        System.out.printf("File name: %s%n", word);
        System.out.printf("File extension: %s", extension);
    }
}
