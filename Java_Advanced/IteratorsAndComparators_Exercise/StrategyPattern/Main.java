package StrategyPattern;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        Set<Person> nameSet = new TreeSet<>(new NameComparator());
        Set<Person> ageSet = new TreeSet<>(new AgeComparator());

        for (int i = 0; i < N; i++) {
            String[] personInfo = scanner.nextLine().split(" ");
            Person newPerson = new Person(personInfo[0], Integer.parseInt(personInfo[1]));
            nameSet.add(newPerson);
            ageSet.add(newPerson);
        }

        for (Person person : nameSet) {
            System.out.printf("%s %d%n", person.getName(), person.getAge());
        }

        for (Person person : ageSet) {
            System.out.printf("%s %d%n", person.getName(), person.getAge());
        }

    }
}
