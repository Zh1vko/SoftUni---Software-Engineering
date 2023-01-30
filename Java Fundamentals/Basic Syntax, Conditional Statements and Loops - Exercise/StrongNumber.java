import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int integer = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int workNum = integer;

        while (!(workNum == 0)) {

            int currentNum = workNum % 10;
            workNum /= 10;
            int factoriel = 1;

            for (int i = 1; i <= currentNum ; i++) {
                factoriel = factoriel * i;
            }
            sum += factoriel;


        }
        if (sum == integer) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
