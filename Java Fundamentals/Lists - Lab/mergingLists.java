import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondList = Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List <Integer> mixedList = new ArrayList<>();
        int minSize = Math.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSize; i++) {
            int numFirstList = firstList.get(i);
            int numSecondList = secondList.get(i);

            mixedList.add(numFirstList);
            mixedList.add(numSecondList);
        }

        if (firstList.size() > secondList.size()) {
            for (int i = minSize; i < firstList.size(); i++) {
                mixedList.add(firstList.get(i));
            }

        } else if (secondList.size() > firstList.size()) {
            for (int i = minSize; i < secondList.size(); i++) {
                mixedList.add(secondList.get(i));
            }
        }


        for (int i = 0; i < mixedList.size(); i++) {
            System.out.print(mixedList.get(i) + " ");
        }
    }
}
