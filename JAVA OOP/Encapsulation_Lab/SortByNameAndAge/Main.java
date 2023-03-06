package SortByNameAndAge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < peopleCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName =  input[1];
            int age = Integer.parseInt(input[2]);

            Person currentPerson = new Person(firstName, lastName, age);
            people.add(currentPerson);
        }

        Collections.sort(people, (firstPerson, secondPerson) -> {
            int comparisonResults = firstPerson.getFirstName().compareTo(secondPerson.getFirstName());

            if (comparisonResults == 0) {
                return Integer.compare(firstPerson.getAge(), secondPerson.getAge());
            }
            return comparisonResults ;
        });

        for (Person person : people) {
            System.out.println(person.toString());
        }


    }
}

