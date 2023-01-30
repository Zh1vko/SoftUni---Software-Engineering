import java.util.Scanner;

public class spiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingYield = Integer.parseInt(scanner.nextLine());
        int remainingYield = 0;
        int totalYield = 0;
        int days = 0;

        while (startingYield >= 100) {
            days++;

            if (startingYield >= 26) {
                remainingYield = startingYield - 26;
            }

          totalYield += remainingYield;
          startingYield -= 10;


        }


        if (totalYield >= 26) {
            totalYield -= 26;
        }

        System.out.println(days);
        System.out.println(totalYield);

    }
}
