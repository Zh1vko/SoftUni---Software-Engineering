import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Students {

        static class Student {
                private String firstName;
                private String lastName;
                private String age;
                private String hometown;

                public Student (String firstName, String lastName, String age, String hometown) {
                   this.firstName = firstName;
                   this.lastName = lastName;
                   this.age = age;
                   this.hometown = hometown;
                }

                public String getFirstName () {
                    return this.firstName;
                }

                public String getLastName () {
                    return this.lastName;
                }
                public String getAge () {
                    return this.age;
                }
                public String getHometown () {
                    return this.hometown;
                }
        }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<Student> studentsList = new ArrayList<>();

        while (!input.equals("end")) {
            String[] commandLine = input.split("\\s+");

            Student currentStudent = new Student(commandLine[0], commandLine[1], commandLine[2], commandLine[3]);
            studentsList.add(currentStudent);

            input = scanner.nextLine();
        }

        String desiredCity = scanner.nextLine();

        for (Student city : studentsList) {
            if (city.getHometown().equals(desiredCity)) {
                System.out.printf("%s %s is %s years old%n", city.getFirstName(), city.getLastName(), city.getAge());
            }
        }
    }
}
