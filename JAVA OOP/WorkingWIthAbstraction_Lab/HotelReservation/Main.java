package HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        double pricePerDay = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        PriceCalculator calc = new PriceCalculator(pricePerDay, days, input[2], input[3]);

        System.out.printf("%.2f", calc.returnValue());
    }
}
