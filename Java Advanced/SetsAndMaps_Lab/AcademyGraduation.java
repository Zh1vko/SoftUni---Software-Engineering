import com.sun.source.tree.Tree;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, double[]> studentInfo = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            String[] gradeInput = scanner.nextLine().split(" ");
            double[] currentNumArr = new double[gradeInput.length];

            for (int j = 0; j < gradeInput.length; j++) {
                double currentNum = Double.parseDouble(gradeInput[j]);
                currentNumArr[j] = currentNum;
            }

            studentInfo.putIfAbsent(name, currentNumArr);
        }

       for (String student : studentInfo.keySet()) {
           double totalGrades = 0;
           int gradeCounter = 0;

           for (Double grade : studentInfo.get(student)) {
               totalGrades += grade;
               gradeCounter++;
           }

           double averageGrade = totalGrades / gradeCounter;


           System.out.printf("%s is graduated with %s%n", student, String.valueOf(averageGrade));


       }
    }
}
