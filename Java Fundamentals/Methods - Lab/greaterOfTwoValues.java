import java.util.Scanner;

public class greaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        switch (input) {

            case "int":
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println(maxInt(a, b));
                break;

            case "char":
                char firstChar = scanner.nextLine().charAt(0);
                char secondChar = scanner.nextLine().charAt(0);
                System.out.println(maxChar(firstChar, secondChar));
                break;

            case "string":
                String firstInput = scanner.nextLine();
                String secondInput = scanner.nextLine();
                System.out.println(maxString(firstInput, secondInput));
                break;
        }
    }

    public static int maxInt (int a, int b) {
            if (a > b) {
                return a;
            } else {
                return b;
            }
    }

    public static char maxChar (char a, char b) {
            if (a >  b) {
                return a;
        } else {
                return b;
            }
    }

    public static String maxString (String a, String b) {
            if (a.compareTo(b) > 0) {
                return a;
            } else {
                return b;
            }

    }
}
