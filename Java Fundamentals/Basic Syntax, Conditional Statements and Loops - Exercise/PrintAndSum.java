import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int beginning = Integer.parseInt(scanner.nextLine());
        int ending = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = beginning; i <= ending ; i++) {
            System.out.print(i + " ");
            sum+=i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);

    }
}
