import java.util.Scanner;

public class vendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 0.1, 0.2, 0.5, 1, and 2

        String input = scanner.nextLine();
        double sum = 0;
        double price = 0;
        boolean isValid = false; // invalid

        while (!input.equals("Start")) {
            double coin = Double.parseDouble(input);


            if (coin == 0.1) {
                sum += coin;
            } else if (coin == 0.20) {
                sum += coin;
            } else if (coin == 0.50) {
                sum += coin;
            } else if (coin == 1) {
                sum += coin;
            } else if (coin == 2) {
                sum += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }

            input = scanner.nextLine();
        }

        String products = scanner.nextLine();

        while (!products.equals("End")) {

            if (products.equals("Nuts")) {
                price = 2.0;
            } else if (products.equals("Water")) {
                price = 0.70;
            } else if (products.equals("Crisps")) {
                price = 1.50;
            } else if (products.equals("Soda")) {
                price = 0.80;
            } else if (products.equals("Coke")) {
                price = 1;
            } else {
                System.out.println("Invalid product");
                isValid = true;
            }

            if (!isValid) {

                sum -= price;

            if (sum >= 0) {
                System.out.printf("Purchased %s%n", products);
            }

            if (sum < 0) {
                System.out.println("Sorry, not enough money");
                sum+=price;
            }

            }
            products = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", Math.abs(sum));
    }
}
