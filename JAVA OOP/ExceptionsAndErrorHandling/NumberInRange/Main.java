package NumberInRange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int lowerBound = Integer.parseInt(input[0]);
        int upperBound = Integer.parseInt(input[1]);

        System.out.printf("Range: [%d...%d]%n", lowerBound, upperBound);

        while (true) {

            String numInput = scanner.nextLine();

            try {
                int number = Integer.parseInt(numInput);
                if (number >= lowerBound && number <= upperBound) {
                    System.out.println("Valid number: " + number);
                    break;
                } else {
                    System.out.println("Invalid number: " + number);
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + numInput);
            }

        }
    }
}
