import java.util.Scanner;

public class waterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int litresInTank = 0;
        int capacity = 255;
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {

            int litres = Integer.parseInt(scanner.nextLine());

            if (litres > capacity) {
                System.out.println("Insufficient capacity!");
            } else {
                capacity -= litres;
                litresInTank += litres;
            }
        }
        System.out.println(litresInTank);


    }
}
