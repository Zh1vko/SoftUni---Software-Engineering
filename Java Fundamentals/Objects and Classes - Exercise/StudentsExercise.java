import java.util.*;

public class StudentsExercise {

        static class Student {
            private String firstName;
            private String lastName;
            private double grade;

            public Student(String firstName, String lastName, double grade) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.grade = grade;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public double getGrade() {
                return grade;
            }
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] commandLine = scanner.nextLine().split(" ");
            String firstName = commandLine[0];
            String lastName = commandLine[1];
            double grade = Double.parseDouble(commandLine[2]);

            Student currentStudent = new Student(firstName, lastName, grade);
            studentsList.add(currentStudent);
        }

        studentsList.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        for (Student item : studentsList) {
            System.out.printf("%s %s: %.2f%n", item.getFirstName(), item.getLastName(), item.getGrade());
        }



    }
}
