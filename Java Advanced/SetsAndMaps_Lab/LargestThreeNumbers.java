import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        List<Integer> numberList = new LinkedList<>();

        for (String number : input) {
            numberList.add(Integer.parseInt(number));
        }

        numberList.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(e -> System.out.printf("%s ", e));



        }
}
