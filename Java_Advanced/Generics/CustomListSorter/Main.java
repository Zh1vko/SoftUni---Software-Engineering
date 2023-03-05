package _07_CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomList list = new CustomList();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] inputLine = input.split("\\s+");
            String command = inputLine[0];

            switch (command) {
                case "Add":
                    String element = inputLine[1];
                    list.addElement(element);
                    break;

                case "Remove":
                    int indexToRemove = Integer.parseInt(inputLine[1]);
                    list.removeElement(indexToRemove);
                    break;

                case "Contains":
                    String checkElement = inputLine[1];
                    System.out.println(list.containsElement(checkElement));
                    break;

                case "Swap":
                    int firstIndex = Integer.parseInt(inputLine[1]);
                    int secondIndex = Integer.parseInt(inputLine[2]);
                    list.swapElements(firstIndex, secondIndex);
                    break;

                case "Greater":
                    String compareElement = inputLine[1];
                    System.out.println(list.greaterElementsCount(compareElement));
                    break;

                case "Min":
                    Object minElement = list.minElement();
                    System.out.println(minElement);
                    break;

                case "Max":
                    Object maxElement = list.maxElement();
                    System.out.println(maxElement);
                    break;

                case "Print":
                    list.printElements();
                    break;

            }

            input = scanner.nextLine();
        }


    }
}
