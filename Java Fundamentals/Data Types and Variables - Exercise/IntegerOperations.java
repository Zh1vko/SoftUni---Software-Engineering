import java.util.Scanner;

public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Add first to the second, divide (integer) the sum by the third number, and multiply the result by the fourth number. Print the result

        int firstInt = Integer.parseInt(scanner.nextLine());
        int secondInt = Integer.parseInt(scanner.nextLine());
        int thirdInt = Integer.parseInt(scanner.nextLine());
        int fourthInt = Integer.parseInt(scanner.nextLine());

        double total = ((firstInt + secondInt) / thirdInt) * fourthInt;
        System.out.printf("%.0f", total);
    }
}
