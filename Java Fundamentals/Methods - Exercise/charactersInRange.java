import java.util.Scanner;

public class charactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char a = scanner.nextLine().charAt(0);                  // Beginning of method
        char b = scanner.nextLine().charAt(0);                  // Ending of method

        rangePrinter(a, b);
    }
    public static void rangePrinter (char a, char b) {

        if (a < b) {
        for (int i = a + 1; i < b; i++) {
            char currentChar = (char) i;
            System.out.print(currentChar + " ");
         }
        }
        else if (a > b) {
            for (int i = b+1; i < a; i++) {
                char currentChar = (char) i;
                System.out.print(currentChar + " ");
            }
        }
    }
}
