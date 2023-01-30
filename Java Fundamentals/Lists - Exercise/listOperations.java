import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!command.equals("End")) {
        String[] commandLine = command.split(" ");
        String operation = commandLine[0];

            switch (operation) {

                case "Add":
                    int number = Integer.parseInt(commandLine[1]);
                    addNum(integerList, number);
                    break;

                case "Insert":
                    int insertNum = Integer.parseInt(commandLine[1]);
                    int insertIndex = Integer.parseInt(commandLine[2]);
                  if (isValidIndex(integerList, insertIndex)) {
                      insertNum(integerList,insertIndex,insertNum);
                  } else {
                      System.out.println("Invalid index");
                  }
                    break;

                case "Remove":
                    int removeIndex = Integer.parseInt(commandLine[1]);
                    if (isValidIndex(integerList, removeIndex)) {
                        removeIndex(integerList, removeIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;

                case "Shift":
                    int count = Integer.parseInt(commandLine[2]);

                    if (commandLine[1].equals("left")) {
                        shiftLeft(integerList, count);
                    } else if (commandLine[1].equals("right")) {
                        shiftRight(integerList, count);
                    }
                    break;
            }

            command = scanner.nextLine();
        }

        for (int num:
             integerList) {
            System.out.print(num + " ");
        }
    }


    public static void addNum (List <Integer> list, int number){
        list.add(number);
    }

    public static void insertNum (List <Integer> list, int index, int number){
       list.add(index, number);
    }

    public static void removeIndex (List <Integer> list, int index){
        list.remove(index);
    }

    public static void shiftLeft (List <Integer> list, int count){
        for (int i = 0; i < count; i++) {
        int currentNum = list.get(0);
        list.remove(0);
        list.add(currentNum);
        }
    }

    public static void shiftRight (List <Integer> list, int count){
        for (int i = 0; i < count; i++) {
            int lastNum = list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0, lastNum);
        }
    }

    public static boolean isValidIndex (List <Integer> list, int index){
        return index >= 0 && index <=list.size() -1;
    }
}
