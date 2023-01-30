import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //((daysInMonth * capsulesCount) * pricePerCapsule)

        int N = Integer.parseInt(scanner.nextLine());
        double totalSum = 0;


        for (int i = 1; i <= N; i++) {
            double currentSum = 0;
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

         currentSum = ((daysInMonth * capsulesCount) * pricePerCapsule);
         totalSum+=currentSum;
            System.out.printf("The price for the coffee is: $%.2f%n", currentSum);
        }
        System.out.printf("Total: $%.2f", totalSum);

    }
}
