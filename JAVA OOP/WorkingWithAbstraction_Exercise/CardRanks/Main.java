package CardRanks;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<CardRanks> rankedList = Arrays.stream(CardRanks.values()).collect(Collectors.toList());


        if (input.equals("Card Ranks")) {
            System.out.println("Card Ranks: ");

            for (CardRanks current : rankedList) {
                System.out.printf("Ordinal value: %d; Name value: %s%n", current.ordinal(), current.name());
            }
        }

    }
}
