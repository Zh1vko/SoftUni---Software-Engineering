import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumsRealNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        BigDecimal totalSum = new BigDecimal(0);

        for (int i = 1; i <= n; i++) {
            BigDecimal currentNum = new BigDecimal(scanner.nextLine());
            totalSum = totalSum.add(currentNum);

        }
        System.out.println(totalSum);
    }
}
