package Exercise_Solutions;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateForNames {
    public static void main(String[] args) {
    Scanner scanner  = new Scanner(System.in);

    int length = Integer.parseInt(scanner.nextLine());
    String[] nameList = scanner.nextLine().split("\\s+");

    Predicate<String> nameChecker = e -> e.length() <= length;

    Arrays.stream(nameList).filter(nameChecker)
            .forEach(e -> System.out.println(e));

    }
}
