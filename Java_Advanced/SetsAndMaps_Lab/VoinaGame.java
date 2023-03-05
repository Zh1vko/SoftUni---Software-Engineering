import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class VoinaGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Integer> deckOne = new LinkedHashSet<>();
        Set<Integer> deckTwo = new LinkedHashSet<>();

        String[] inputOne = scanner.nextLine().split(" ");
        String[] inputTwo = scanner.nextLine().split(" ");

        for (int i = 0; i < inputOne.length; i++) {
            int currentNumber = Integer.parseInt(inputOne[i]);
            deckOne.add(currentNumber);
        }

        for (int i = 0; i < inputTwo.length; i++) {
            int currentNumber = Integer.parseInt(inputTwo[i]);
            deckTwo.add(currentNumber);
        }

        int counter = 1;
        while (deckOne.size() > 0 || deckTwo.size() > 0) {

            Iterator<Integer> iteratorOne = deckOne.iterator();
            Iterator<Integer> iteratorTwo = deckTwo.iterator();

            if (counter >= 50) {
                break;
            }

            int firstCard = iteratorOne.next();
            int secondCard = iteratorTwo.next();

            deckOne.remove(firstCard);
            deckTwo.remove(secondCard);

            if (firstCard > secondCard) {
                deckOne.add(firstCard);
                deckOne.add(secondCard);
            } else if (secondCard > firstCard) {
                deckTwo.add(firstCard);
                deckTwo.add(secondCard);
            } else {
                deckOne.add(firstCard);
                deckTwo.add(secondCard);
            }
            counter++;
        }

        if (deckOne.size() > deckTwo.size()) {
            System.out.println("First player win!");
        } else if (deckTwo.size() > deckOne.size()) {
            System.out.println("Second player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}
