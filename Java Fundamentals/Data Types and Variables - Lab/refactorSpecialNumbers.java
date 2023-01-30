import java.util.Scanner;

public class refactorSpecialNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());



        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            int totalSum = 0;

            while (currentNum > 0) {
                int workNum = currentNum % 10;
                currentNum /= 10;
                totalSum += workNum;
            }

            if  ((totalSum == 5) || (totalSum == 7) || (totalSum == 11)) {
                System.out.printf("%d -> True%n", i);
            } else {
                System.out.printf("%d -> False%n", i);
            }

        }
    }
}
