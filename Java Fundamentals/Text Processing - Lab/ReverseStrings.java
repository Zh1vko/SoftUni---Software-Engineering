import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        while (!input.equals("end")) {

            StringBuilder reversedString = new StringBuilder(input);
            reversedString.reverse();
            reversedString.toString();


            System.out.printf("%s = %s%n", input, reversedString);


            input = scanner.nextLine();
        }
    }
}
