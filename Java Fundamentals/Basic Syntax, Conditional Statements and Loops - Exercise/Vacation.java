import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        String peopleType = scanner.nextLine();
        String dayType = scanner.nextLine();
        double totalPrice = 0;

        if (peopleType.equals("Business")) {
            if (number >= 100) {
                number -= 10;
            }
        }

        if (dayType.equals("Friday")) {
            if (peopleType.equals("Students")) {
                totalPrice = number * 8.45;
            } else if (peopleType.equals("Business")) {
                totalPrice = number * 10.90;
            } else if (peopleType.equals("Regular")) {
                totalPrice = number * 15;
            }

        } else if (dayType.equals("Saturday")) {
                 if (peopleType.equals("Students")) {
                     totalPrice = number * 9.80;
            } else if (peopleType.equals("Business")) {
                     totalPrice = number * 15.60;
            } else if (peopleType.equals("Regular")) {
                     totalPrice = number * 20;
            }

        } else if (dayType.equals("Sunday")) {
            if (peopleType.equals("Students")) {
                totalPrice = number * 10.46;
            } else if (peopleType.equals("Business")) {
                totalPrice = number * 16;
            } else if (peopleType.equals("Regular")) {
                totalPrice = number * 22.50;
            }
        }

        if (peopleType.equals("Students")) {
            if (number >= 30) {
                totalPrice = totalPrice * 0.85;
            }
        }

        if (peopleType.equals("Regular")) {
            if (number >= 10 && number <= 20) {
                totalPrice = totalPrice * 0.95;
            }
        }

        System.out.printf("Total price: %.2f", totalPrice);
    }
}
