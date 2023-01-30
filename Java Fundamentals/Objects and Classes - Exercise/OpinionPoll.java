import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OpinionPoll {

    public static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        List<Person> peopleList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            String name = commandLine[0];
            int age = Integer.parseInt(commandLine[1]);

            Person currentPerson = new Person(name, age);
            peopleList.add(currentPerson);
        }


        for (Person item : peopleList) {
            if (item.getAge() > 30) {
                System.out.printf("%s - %d%n", item.getName(), item.getAge());
            }
        }

    }
}
