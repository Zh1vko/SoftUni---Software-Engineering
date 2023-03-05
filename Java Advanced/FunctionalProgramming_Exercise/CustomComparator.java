package Exercise_Solutions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> numberComparator = ((firstNum, secondNum) -> {
            if (firstNum % 2 == 0 && secondNum % 2 != 0) {
                return -1;
            }
            else if (firstNum % 2 != 0 && secondNum % 2 == 0) {
                return 1;
            }
            else {
                return firstNum.compareTo(secondNum);
                //first == second -> 0
                //first < second -> -1
                //first > second -> 1  -> Move numbers
            }
        });

        numbers.stream().sorted(numberComparator).forEach(number -> System.out.print(number + " "));

    }
}
