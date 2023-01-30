import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class cardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int i = 0;
        while (firstDeck.size() > 0 && secondDeck.size() > 0) {

            int firstHand = firstDeck.get(0);
            int secondHand = secondDeck.get(0);

            if (firstHand > secondHand) {
                firstDeck.remove(Integer.valueOf(firstHand));            // remove from 1st place
                firstDeck.add(firstHand);               // winning hand 2nd to last
                firstDeck.add(secondHand);              // losing hand last

                secondDeck.remove(Integer.valueOf(secondHand));          // remove lost hand from deck

            } else if (secondHand > firstHand) {
                secondDeck.remove(Integer.valueOf(secondHand));
                secondDeck.add(secondHand);
                secondDeck.add(firstHand);

                firstDeck.remove(Integer.valueOf(firstHand));
            }
                else if (firstHand == secondHand) {
                firstDeck.remove(Integer.valueOf(firstHand));
                secondDeck.remove(Integer.valueOf(secondHand));

            }

           i += 1;
        }
            int sum = 0;
        if (firstDeck.size() > secondDeck.size()) {
            sum = sumCount(firstDeck);
            System.out.printf("First player wins! Sum: %d", sum);
        } else {
            sum = sumCount(secondDeck);
            System.out.printf("Second player wins! Sum: %d", sum);
        }
    }

    public static int sumCount (List <Integer> list) {
        int sum = 0;
        for (int value: list) {
            sum += value;

        }
        return sum;
    }
}
