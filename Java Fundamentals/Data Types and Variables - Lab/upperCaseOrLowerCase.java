import java.util.Scanner;

public class upperCaseOrLowerCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String character = scanner.nextLine();

        if (character.equals(character.toUpperCase())) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
