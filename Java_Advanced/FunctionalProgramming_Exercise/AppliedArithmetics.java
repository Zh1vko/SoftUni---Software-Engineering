package Exercise_Solutions;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> addFunction = list -> list.stream().map(number -> number += 1).collect(Collectors.toList());    // All numbers +1
        Function<List<Integer>, List<Integer>> multiplyFunction = list -> list.stream().map(number -> number *= 2).collect(Collectors.toList());    // All numbers * 2
        Function<List<Integer>, List<Integer>> subtractFunction = list -> list.stream().map(number -> number -= 1).collect(Collectors.toList());    // All numbers -1
        Consumer<List<Integer>> printFunction = list -> list.forEach(e -> System.out.print(e + " "));       // Print all numbers on a new line

        String command = scanner.nextLine();

        while (!command.equals("end")) {

                switch (command) {
                    case "add":
                        numberList = addFunction.apply(numberList);
                        break;

                    case "multiply":
                        numberList = multiplyFunction.apply(numberList);
                        break;

                    case "subtract":
                        numberList = subtractFunction.apply(numberList);
                        break;

                    case "print":
                        printFunction.accept(numberList);
                        System.out.println();
                        break;
                }

            command = scanner.nextLine();
        }

    }
}