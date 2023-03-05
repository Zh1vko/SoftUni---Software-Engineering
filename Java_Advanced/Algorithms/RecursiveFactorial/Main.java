package RecursiveFactorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(getFactorial(n));
    }

    private static int getFactorial(int n) {

        if (n == 0) {
            return 1;
        }

        return n * getFactorial(n-1);
    }
}
