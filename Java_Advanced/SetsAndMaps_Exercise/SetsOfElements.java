import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        int firstSetLength = Integer.parseInt(input[0]);
        int secondSetLength = Integer.parseInt(input[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet=  new LinkedHashSet<>();

        for (int i = 0; i < firstSetLength + secondSetLength; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            if (i < firstSetLength) {
                firstSet.add(currentNum);
            } else {
                secondSet.add(currentNum);
                if (firstSet.contains(currentNum)) {
                }
            }
        }

        firstSet.retainAll(secondSet);
        firstSet.forEach(e -> System.out.print(e + " "));
    }
}
