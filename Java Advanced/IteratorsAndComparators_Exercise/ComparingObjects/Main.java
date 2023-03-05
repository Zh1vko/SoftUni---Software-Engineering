package ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> peopleList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] personData = input.split(" ");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);
            String town = personData[2];

            Person currentPerson = new Person(name, age, town);
            peopleList.add(currentPerson);

            input = scanner.nextLine();
        }

        int N = Integer.parseInt(scanner.nextLine());


        Person comparePerson = peopleList.get(N-1);

        int equalPeople = 0;
        int notEqualPeople = 0;
        int totalMatches = equalPeople + notEqualPeople;

        for (int index = 0; index < peopleList.size(); index++) {

                Person currentPerson = peopleList.get(index);
                int compareResult = comparePerson.compareTo(currentPerson);

                if (compareResult != 0) {
                    notEqualPeople++;
                    totalMatches++;
                } else {
                    equalPeople++;
                    totalMatches++;
                }
            }


        if (equalPeople > 1) {
            System.out.printf("%d %d %d%n", equalPeople, notEqualPeople, totalMatches);
        } else {
            System.out.println("No matches");
        }
    }
}
