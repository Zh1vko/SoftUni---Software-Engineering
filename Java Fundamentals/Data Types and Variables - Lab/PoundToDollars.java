import java.util.Scanner;

public class PoundToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1 British Pound = 1.36 Dollars 3rd decimal point

        double pounds = Double.parseDouble(scanner.nextLine());
        double dollars = pounds * 1.36;
        System.out.printf("%.3f",dollars);


    }
}
