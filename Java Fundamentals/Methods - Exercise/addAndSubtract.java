import java.util.Scanner;

public class addAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        int sumResult = sumNumbers(firstNum, secondNum);

        int finalResult = extractNumbers(sumResult, thirdNum);
        System.out.println(finalResult);
    }

    public static int sumNumbers (int a, int b) {
        return a + b;
    }

    public static int extractNumbers (int a, int b) {
        return a - b;
    }
}
