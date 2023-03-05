package Exercise_Solutions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class ListOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        BiFunction<Integer, List<Integer>, Boolean> isDivisible = ((number, list) -> {
            for (int numInList : list) {
                if (number % numInList != 0) {
                    return false;
                }
            }
            // All numbers in the list can divide the current number -> true
            return true;
        });


        for (int number = 1; number <= n; number++) {
            if (isDivisible.apply(number, numbers)) {           // check current number if all elements in the list can divide it
                System.out.print(number + " ");
            }
        }
    }
}
