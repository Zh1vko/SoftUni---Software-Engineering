import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {

    static class Student {
        private String firstName;
        private String lastName;
        private String age;
        private String hometown;

        public Student(String firstName, String lastName, String age, String hometown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.hometown = hometown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public void setHometown(String hometown) {
            this.hometown = hometown;
        }

        public String getHometown() {
            return this.hometown;
        }
    }



       public static int findStudentsIndex (List<Student> studentList, String firstName, String lastName) {
           for (int i = 0; i < studentList.size(); i++) {
               String firstNameList = studentList.get(i).getFirstName();
               String lastNameList = studentList.get(i).getLastName();

               if (firstNameList.equals(firstName) && lastNameList.equals(lastName)) {
                   return i;
               }
           }
           return -1;
       }




        public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          List<Student> studentsList = new ArrayList<>();

          String input = scanner.nextLine();

          while (!input.equals("end")) {
            String[] commandLine = input.split("\\s+");
            Student newStudent = new Student(commandLine[0], commandLine[1], commandLine[2], commandLine[3]);

            int studentIndex = findStudentsIndex(studentsList, newStudent.getFirstName(), newStudent.getLastName());

             if (studentIndex != -1) {
                 studentsList.get(studentIndex).setAge(newStudent.getAge());
                 studentsList.get(studentIndex).setHometown(newStudent.getHometown());
             } else {
                 studentsList.add(newStudent);
             }

              input = scanner.nextLine();
          }

        String town = scanner.nextLine();

        if (town.equals("all")) {

            for (Student student : studentsList) {
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }
        else {
                for (Student student : studentsList) {
                    if (student.getHometown().equals(town)) {
                        System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
                    }
                }
        }
    }
}