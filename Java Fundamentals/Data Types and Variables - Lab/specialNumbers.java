import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // A number is special when its sum of digits is 5, 7, or 11.

        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= n; i++) {
            int workNum = i;
            int sum = 0;

            while (workNum > 0) {

                int currentNum = workNum % 10;
                workNum /= 10;
                sum += currentNum;

            }

        if (sum == 5 || sum == 7 || sum == 11) {
            System.out.printf("%d -> True%n", i);
        } else {
            System.out.printf("%d -> False%n", i);
        }

        }



    }
}
