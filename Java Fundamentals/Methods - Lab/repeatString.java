import java.util.Scanner;

public class repeatString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());


        String endResult = newText(text, n);
        System.out.println(endResult);
    }

    public static String newText (String input, int n) {
        String result = "";

        for (int i = 0; i < n; i++) {
            result = result + input;
        }


        return result;
    }
}
