import java.util.Scanner;

public class padawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currentMoney = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightSaberPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double lightSaberTotal = Math.ceil((students * 0.10) + students) * lightSaberPrice;
        double robePriceTotal = students * robePrice;

        int freeBelts = students / 6;
        double beltTotalPrice = (students - freeBelts) * beltPrice;

        double totalPrice = lightSaberTotal + robePriceTotal + beltTotalPrice;

        if (currentMoney >= totalPrice) {

            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        } else {
            double diff = totalPrice - currentMoney;
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }

    }
}
