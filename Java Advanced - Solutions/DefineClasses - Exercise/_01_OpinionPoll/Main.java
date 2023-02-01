package _01_OpinionPoll;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> peopleMap = new TreeMap<>();

        // Can be done with a List<Person> -> sort through all and filter
        // Easier and faster with a simple map to put name - age pairs (age > 30).
        // TreeMap -> sort names in ascending order.

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            if (age > 30) {
                peopleMap.put(name, age);
            }
        }

        for (Map.Entry<String, Integer> entry: peopleMap.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }
    }
}
