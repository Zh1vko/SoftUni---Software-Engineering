import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String occurrence = scanner.nextLine();
        String word = scanner.nextLine();


        while (word.contains(occurrence)) {

            word = word.replace(occurrence, "");

        }
        System.out.println(word );
    }
}
