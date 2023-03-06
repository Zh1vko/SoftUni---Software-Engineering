package FirstAndReserveTeam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playersCount = Integer.parseInt(scanner.nextLine());
        Team team = new Team("Black Eagles");       // Asen Ivanov 20 2200

        for (int i = 0; i < playersCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            Person currentPerson = new Person(firstName, lastName, age, salary);
            team.addPlayer(currentPerson);

        }

        System.out.println("First team have " + team.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " + team.getReserveTeam().size() + " players");
    }
}
