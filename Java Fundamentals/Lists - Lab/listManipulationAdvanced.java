import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split(" ");
            String operation = command[0];

            switch (operation) {

                case "Contains":
                    int number = Integer.parseInt(command[1]);
                    containsCheck(integerList, number);
                    break;

                case "Print":
                    if (command[1].equals("even")) {
                    evenPrinter(integerList);
                    System.out.println();
                    }
                    if (command[1].equals("odd")) {
                        oddPrinter(integerList);
                        System.out.println();
                    }
                    break;

                case "Get":
                    System.out.println(sumNumbers(integerList));
                    break;

                case "Filter":
                    int filterNum = Integer.parseInt(command[2]);

                    if (command[1].equals("<")) {
                        for (int i = 0; i < integerList.size(); i++) {
                            if (integerList.get(i) < filterNum) {
                                System.out.print(integerList.get(i) + " ");

                            }
                        }
                        System.out.println();
                    }

                    else if (command[1].equals(">")) {
                        for (int i = 0; i < integerList.size(); i++) {
                            if (integerList.get(i) > filterNum) {
                                System.out.print(integerList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }

                    else if (command[1].equals(">=")) {
                        for (int i = 0; i < integerList.size(); i++) {
                            if (integerList.get(i) >= filterNum) {
                                System.out.print(integerList.get(i) + " ");
                            }
                        }
                        System.out.println();
                    }
                    else if (command[1].equals("<=")) {
                        for (int i = 0; i < integerList.size(); i++) {
                            if (integerList.get(i) <= filterNum) {
                                System.out.print(integerList.get(i) + " ");

                            }
                        }
                        System.out.println();
                    }
                    break;

            }

            input = scanner.nextLine();
        }
    }

    public static void containsCheck (List <Integer> list, int number) {
            boolean containCheck = false;

        for (int i = 0; i < list.size(); i++) {
            int currentNum = list.get(i);
            if (currentNum == number) {
                containCheck = true;
            }
        }

        if (containCheck) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

    public static void evenPrinter (List <Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                System.out.print(list.get(i) + " ");
            }
         }
    }

    public static void oddPrinter (List <Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 != 0) {
                System.out.print(list.get(i) + " ");
            }
        }
    }

    public static int sumNumbers (List <Integer> list) {
        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }



}
