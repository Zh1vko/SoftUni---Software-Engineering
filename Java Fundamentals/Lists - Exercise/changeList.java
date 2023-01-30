import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String commandLine = scanner.nextLine();


        while (!commandLine.equals("end")) {
            String[] operations = commandLine.split(" ");
            String operation = operations[0];

            switch (operation) {

                case "Delete":
                    int element = Integer.parseInt(operations[1]);

                    for (int i = 0; i < integerList.size(); i++) {
                        if (element == integerList.get(i)){
                            integerList.remove(i);
                        }
                    }
                    break;

                case "Insert":
                    int insertElement = Integer.parseInt(operations[1]);
                    int insertIndex = Integer.parseInt(operations[2]);
                    integerList.add(insertIndex, insertElement);
                    break;

            }

            commandLine = scanner.nextLine();
        }

        for (int item:
             integerList) {
            System.out.print(item + " ");
        }
    }
}
