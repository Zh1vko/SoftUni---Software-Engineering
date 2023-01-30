import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {

        //· 2.00 – 2.99 - "Fail"
        //· 3.00 – 3.49 - "Poor"
        //· 3.50 – 4.49 - "Good"
        //· 4.50 – 5.49 - "Very good"
        //· 5.50 – 6.00 - "Excellent"

        Scanner scanner = new Scanner(System.in);
        double grade = Double.parseDouble(scanner.nextLine());

        gradeCheck(grade);
    }


    public static void gradeCheck (double input) {

      if (input >= 2 && input <= 2.99) {
          System.out.println("Fail");
      } else if (input >= 3 && input <= 3.49) {
          System.out.println("Poor");
      } else if (input >= 3.50 && input <= 4.49) {
          System.out.println("Good");
      } else if (input >= 4.50 && input <= 5.49) {
          System.out.println("Very good");
      } else if (input >= 5.50 && input <= 6) {
          System.out.println("Excellent");
      }

    }
}
