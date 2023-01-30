import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {

        // 0 <= age <= 18
        // 18 < age <= 64
        // 64 < age <= 122
        // otherwise "Error!"


        Scanner scanner = new Scanner(System.in);

        String dayType = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        int ticketPrice = 0;
        boolean isValid = false;        // valid day, valid age;


        if (dayType.equals("Weekday")) {
            if (age >= 0 && age <= 18) {
                ticketPrice = 12;
                isValid = true;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 18;
                isValid = true;
            } else if (age > 64 && age <= 122) {
                ticketPrice = 12;
                isValid = true;
            }
        }

        if (dayType.equals("Weekend")) {
            if (age >= 0 && age <= 18) {
                ticketPrice = 15;
                isValid = true;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 20;
                isValid = true;
            } else if (age > 64 && age <= 122) {
                ticketPrice = 15;
                isValid = true;
            }
        }

        if (dayType.equals("Holiday")) {
            if (age >= 0 && age <= 18) {
                ticketPrice = 5;
                isValid = true;
            } else if (age > 18 && age <= 64) {
                ticketPrice = 12;
                isValid = true;
            } else if (age > 64 && age <= 122) {
                ticketPrice = 10;
                isValid = true;
            }
        }

        if (isValid) {
            System.out.println(ticketPrice + "$");
        } else {
            System.out.println("Error!");
        }

    }
}
