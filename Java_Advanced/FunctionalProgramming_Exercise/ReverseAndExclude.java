package Exercise_Solutions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ReverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int n = Integer.parseInt(scanner.nextLine());
        Collections.reverse(numberList);

        Predicate<Integer> divisionFunction = e -> e % n == 0;   // Boolean check -> true if 0, False if != 0

        numberList.removeIf(divisionFunction);  // Predicate condition

        numberList.forEach( e -> System.out.print(e + " "));

    }
}
