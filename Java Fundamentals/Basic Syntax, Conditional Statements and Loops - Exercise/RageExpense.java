import java.util.Scanner;

public class RageExpense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // every 2nd lost game thrashes headset
        // every 3rd lost game thrashes mouse
        // every time headset + mouse -> thrashes keyboard
        // every 2nd time thrashes keyboard -> thrashes display


        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCounter = lostGames / 2;
        int mouseCounter = lostGames / 3;
        int keyboardCounter = lostGames / 6;
        int displayCounter = lostGames / 12;

        double totalPrice = headsetPrice * headsetCounter + mousePrice * mouseCounter + keyboardPrice * keyboardCounter + displayCounter * displayPrice;

        System.out.printf("Rage expenses: %.2f lv.", totalPrice);



    }
}
