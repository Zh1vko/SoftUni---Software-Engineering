import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            String operation = command[0];

            switch (operation) {
                case "Add":
                    int currentNum = Integer.parseInt(command[1]);
                    integerList.add(currentNum);
                    break;

                case "Remove":
                    int removalNum = Integer.parseInt(command[1]);
                    integerList.remove(Integer.valueOf(removalNum));
                    break;

                case "RemoveAt":
                    int removeIndex = Integer.parseInt(command[1]);
                    integerList.remove(removeIndex);
                    break;

                case "Insert":
                    int addValue = Integer.parseInt(command[1]);
                    int addIndex = Integer.parseInt(command[2]);
                    integerList.add(addIndex, addValue);
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
    }
}
