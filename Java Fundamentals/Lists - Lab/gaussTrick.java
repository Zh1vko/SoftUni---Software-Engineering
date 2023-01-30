import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class gaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());

        int size = numbersList.size();
        for (int i = 0; i < size/2 ; i++) {
            int currentNum = numbersList.get(i);
            int lastNum = numbersList.get(numbersList.size()-1);

            numbersList.set(i, currentNum + lastNum);
            numbersList.remove(numbersList.size()-1);
            System.out.println();
        }

        for (int i = 0; i < numbersList.size(); i++) {
            System.out.print(numbersList.get(i) + " ");
        }
    }
}
