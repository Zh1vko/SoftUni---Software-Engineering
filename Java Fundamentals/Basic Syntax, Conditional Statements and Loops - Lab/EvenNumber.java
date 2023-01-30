import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int integer = Integer.parseInt(scanner.nextLine());

    while (integer % 2 != 0) {
        System.out.println("Please write an even number.");
        integer = Integer.parseInt(scanner.nextLine());
    }

        System.out.printf("The number is: %d", Math.abs(integer));
    }
}
