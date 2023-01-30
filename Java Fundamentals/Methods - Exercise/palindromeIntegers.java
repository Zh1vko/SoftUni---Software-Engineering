import java.util.Scanner;

public class palindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = scanner.nextLine();

       while (!input.equals("END")) {
            int number = Integer.parseInt(input);
            int reversed = Integer.parseInt(String.valueOf(reverseNumber(input)));

           if (number == reversed) {
               System.out.println("true");
           } else {
               System.out.println("false");
           }

           input = scanner.nextLine();
       }

    }
    public static StringBuffer reverseNumber (String n) {
        StringBuffer reverse = new StringBuffer(n);
        reverse.reverse();
        return reverse;

    }
}
