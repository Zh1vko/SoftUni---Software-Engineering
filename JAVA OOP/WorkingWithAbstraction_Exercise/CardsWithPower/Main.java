package CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cardRank = scanner.nextLine();
        String cardSuit = scanner.nextLine();

        int sum = CardRanks.valueOf(cardRank).getValue() + CardSuits.valueOf(cardSuit).getValue();
        System.out.printf("Card name: %s of %s; Card power: %d%n", cardRank, cardSuit, sum);
    }
}
