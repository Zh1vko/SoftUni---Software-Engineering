import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class orderByAge {

    static class Person {
            private String name;
            private String id;
            private int age;

        public Person(String name, String id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> peopleList = new ArrayList<>();

        while (!input.equals("End")) {
                String[] commandLine = input.split(" ");
                String name = commandLine[0];
                String id = commandLine[1];
                int age = Integer.parseInt(commandLine[2]);

                Person currentPerson = new Person(name, id, age);
                peopleList.add(currentPerson);
            input = scanner.nextLine();
        }

        peopleList.sort(Comparator.comparing(Person::getAge));
        for (Person current : peopleList) {
            System.out.printf("%s with ID: %s is %d years old.%n", current.getName(), current.getId(), current.getAge());
        }
    }
}
