package Collection;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListyIterator list = null;
        String data = scanner.nextLine();

        while (!data.equals("END")) {
            String[] commandsPart = data .split("\\s+");
            String command = commandsPart[0];

            switch (command) {
                case "Create":
                    if (commandsPart.length > 1) {
                        String[] elementArray = Arrays.copyOfRange(commandsPart, 1, commandsPart.length);
                        list = new ListyIterator(elementArray);
                    }else {
                        list = new ListyIterator();
                    }
                    break;
                case "Move":
                    System.out.println(list.move());
                    break;
                case "Print":
                    try {
                        list.printIndex();
                    } catch (IllegalStateException e) {
                        System.out.println("Invalid Operation!");
                    }
                    break;
                case "HasNext":
                    System.out.println(list.hasNext());
                    break;

                case "PrintAll":
                    try {
                        list.forEach(e -> System.out.print(e + " "));
                        System.out.println();
                    } catch (NullPointerException e) {
                        System.out.println("Empty List");
                }

                    break;
            }

            data = scanner.nextLine();
        }



    }
}
