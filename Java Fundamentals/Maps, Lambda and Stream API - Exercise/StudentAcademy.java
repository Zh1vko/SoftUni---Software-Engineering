import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map <String, ArrayList<Double>> studentInfo = new LinkedHashMap<>();
        Map <String, Double> finalInfo = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            studentInfo.putIfAbsent(name, new ArrayList<>());
            studentInfo.get(name).add(grade);
        }

        for (Map.Entry<String, ArrayList<Double>> entry : studentInfo.entrySet()) {

            String name = entry.getKey();
            double totalGrades = 0;

            for (int i = 0; i < entry.getValue().size(); i++) {
                double currentGrade = entry.getValue().get(i);
                totalGrades+= currentGrade;
                double averageGrade = totalGrades / entry.getValue().size();
                finalInfo.put(name, averageGrade);
            }

        }
            for (Map.Entry<String, Double> calc : finalInfo.entrySet()) {
                double current = calc.getValue();
                if (current < 4.50) {
                    finalInfo.remove(calc);
                }
            }



            for (Map.Entry<String, Double> entry1 : finalInfo.entrySet()) {
                if (entry1.getValue() >= 4.50) {
                    System.out.printf("%s -> %.2f%n", entry1.getKey(), entry1.getValue());
                }

            }
    }
}
