import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class removeNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> integerList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        for (int i = 0; i < integerList.size(); i++) {
            if (integerList.get(i) < 0) {
                integerList.remove(i);
                i = i-1;
            }
        }
        if (integerList.size() == 0) {
            System.out.println("empty");
        } else {
        for (int i = integerList.size()-1; i >= 0; i--) {
            System.out.print(integerList.get(i) + " ");
                }
        }
    }
}
