import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double firstNum = Double.parseDouble(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        System.out.println(new DecimalFormat("0.####").format(powerNum(firstNum, secondNum)));
    }

    public static double powerNum (double a, int b) {

        return Math.pow(a, b);
    }
}
