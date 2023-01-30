import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int oddPosition = 1;
        int oddNum = 1;

        while (oddPosition <= n) {
            if (oddNum % 2 != 0) {
                sum+= oddNum;
                oddPosition++;
                System.out.println(oddNum);
            }


            oddNum++;
        }
        System.out.println("Sum: " + sum);
    }
}
