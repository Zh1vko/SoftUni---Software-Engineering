import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullLifts = people / capacity;
        int remainingPeople = people % capacity;

        if (remainingPeople != 0) {
            System.out.println(fullLifts + 1);
            } else {
                System.out.println(fullLifts);
            }

    }
}
