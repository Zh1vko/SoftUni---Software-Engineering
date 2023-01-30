import java.util.Scanner;

public class orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());


        orderValue(product, quantity);
    }

    public static void orderValue (String product, int volume) {
        double results = 0;

        switch (product) {

            case "coffee":
                 results = volume * 1.50;
                System.out.printf("%.2f", results);
                break;

            case "water":
                 results = volume * 1.00;
                System.out.printf("%.2f", results);
                break;

            case "coke":
                results = volume * 1.40;
                System.out.printf("%.2f", results);
                break;

            case "snacks":
                results = volume * 2.00;
                System.out.printf("%.2f", results);
                break;
        }

    }
}
