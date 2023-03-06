package SalaryIncrease;

import java.util.ArrayList;
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
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);       //TODO: Change constructor and toString method

            Person currentPerson = new Person(firstName, lastName, age, salary);
            people.add(currentPerson);
        }

        double percentageBonus = Double.parseDouble(scanner.nextLine());

        for (Person person : people) {
            person.increaseSalary(percentageBonus);
            System.out.println(person);
        }
   }
}