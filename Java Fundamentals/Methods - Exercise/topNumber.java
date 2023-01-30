import java.util.Scanner;

public class topNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        // Its sum of digits is divisible by 8
        // Holds at least one odd digit

        topNumberChecker(n);
    }

    public static void topNumberChecker (int n) {
        for (int i = 1; i <= n; i++) {
            boolean oddDigit = false;
            int currentNum = i;
            int digitsSum = 0;

            while (currentNum != 0) {
                int workNum = currentNum % 10;
                digitsSum += workNum;

                if (workNum % 2 != 0) {
                    oddDigit = true;
                }

                currentNum /= 10;
            }

            if (digitsSum % 8 == 0 && oddDigit) {
                System.out.println(i);
            }
        }
    }
}
