import java.math.BigInteger;
import java.util.Scanner;

public class bigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int factorialNum = Integer.parseInt(scanner.nextLine());
        BigInteger factorialSum = new BigInteger("1");

        for (int i = 1; i <= factorialNum; i++) {
          factorialSum = factorialSum.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factorialSum);
    }
}
