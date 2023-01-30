import java.text.DecimalFormat;
import java.util.Scanner;

public class mathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        String operationInput = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());


       double operationResult =  mathOperation(a, operationInput, b);
        System.out.println(new DecimalFormat("0.##").format(operationResult));
    }

    public static double mathOperation (double a, String operation, double b) {
        double results = 0;

        switch (operation) {

            case "/":
                results = a / b;
                break;
            case "*":
                results = a * b;
                break;
            case "+":
                results = a + b;
                break;
            case "-":
                results = a - b;
                break;
        }
        return results;
    }
}
