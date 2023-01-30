import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagons = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] operations = command.split(" ");
            String operation = operations[0];

            if (operation.equals("Add")) {
                int passengers = Integer.parseInt(operations[1]);
                wagons.add(passengers);
            } else {

                int people = Integer.parseInt(operations[0]);

                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);

                    if (currentWagon + people <= maxCapacity) {
                        wagons.set(i, currentWagon + people);
                        break;
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int item: wagons) {
            System.out.print(item + " ");
        }
    }
}
