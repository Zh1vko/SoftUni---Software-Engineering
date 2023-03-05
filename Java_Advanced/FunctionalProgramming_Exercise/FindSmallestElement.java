package Exercise_Solutions;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        Function<List<Integer>, Integer> smallestNumber = list -> list.lastIndexOf(Collections.min(numberList));
        int lastIndex = smallestNumber.apply(numberList);
        System.out.println(lastIndex);

    }
}
