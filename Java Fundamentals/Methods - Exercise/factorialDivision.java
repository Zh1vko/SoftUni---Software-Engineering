import java.util.Scanner;

public class factorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        long factorialA = factorialOperation(a);
        long factorialB = factorialOperation(b);
        double finalResult = factorialA * 1.0/ factorialB;

        System.out.printf("%.2f", finalResult);
    }

    public static long factorialOperation (int number) {
        long result = 1;
        for (int i = 1; i <= number ; i++) {
            result = result * i;
        }
        return result;
    }

}
