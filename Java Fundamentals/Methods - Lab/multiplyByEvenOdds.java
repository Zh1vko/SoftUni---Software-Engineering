import java.util.Scanner;

public class multiplyByEvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Multiply sum of Even numbers by sum of Odd numbers;
        int a = Math.abs(Integer.parseInt(scanner.nextLine()));
        int evenSum = evenSum(a);
        int oddSum = oddSum(a);

        System.out.println(evenSum * oddSum);

    }

    public static int evenSum (int a) {
        int evenSum = 0;
        while (a > 0) {
           int currentNum = a % 10;
            if (currentNum % 2 == 0) {
                evenSum += currentNum;
            }
            a /= 10;
        }
        return evenSum;
    }
    
    public static int oddSum (int a) {
        int oddSum = 0;
        while (a > 0) {
            int currentNum = a % 10;
            if (currentNum % 2 != 0) {
                oddSum += currentNum;
            }
            a /= 10;
        }
        return oddSum;
    }
}
