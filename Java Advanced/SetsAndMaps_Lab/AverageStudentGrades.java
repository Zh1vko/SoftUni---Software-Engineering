import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class AverageStudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, ArrayList<Double>> studentMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            String name = inputLine[0];
            double currentGrade = Double.parseDouble(inputLine[1]);

            studentMap.putIfAbsent(name, new ArrayList<>());
            studentMap.get(name).add(currentGrade);
        }

        for (String key : studentMap.keySet()) {
            int counter = 0;
            double sumGrades = 0;
            System.out.print(key +" -> ");
            for (int i = 0; i < studentMap.get(key).size(); i++) {
                System.out.printf("%.2f ", studentMap.get(key).get(i));
                sumGrades += studentMap.get(key).get(i);
                counter++;
            }
            System.out.printf("(avg: %.2f)%n", sumGrades / counter);
        }
    }
}
