import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int workNum = number;
        int sum = 0;

        while (workNum > 0) {

            int currentNum = workNum % 10;
            sum += currentNum;
            workNum /= 10;

        }
        System.out.println(sum);
    }
}
