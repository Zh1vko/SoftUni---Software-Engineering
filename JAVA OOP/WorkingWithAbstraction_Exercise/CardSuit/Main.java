package CardSuit;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<CardSuits> cardSuits = Arrays.stream(CardSuits.values()).collect(Collectors.toList());

        if (input.equals("Card Suits")) {
            System.out.println("Card Suits: ");
            for (CardSuits current : cardSuits) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", current.ordinal(), current.name());
            }
        }
    }
}
