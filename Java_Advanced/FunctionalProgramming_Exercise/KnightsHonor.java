package Exercise_Solutions;

import java.util.Scanner;
import java.util.function.Consumer;

public class KnightsHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] names = input.split("\\s+");

        Consumer<String> printName = name -> System.out.println("Sir " + name);

        for (String name : names) {
            printName.accept(name);
        }
    }
}
