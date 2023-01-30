import java.util.Scanner;

public class signOfInteger {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        signCheck(n);
    }

    public static void signCheck (int num) {
            if (num > 0) {
                System.out.printf("The number %d is positive.", num);
            } else if (num < 0) {
                System.out.printf("The number %d is negative.", num);
            } else {
                System.out.printf("The number %d is zero.", num);
            }
    }
}
