import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        Map<String, ArrayList<String>> courseMap = new LinkedHashMap<>();


        while (!command.equals("end")) {
            String[] commandLine = command.split(" : ");
            String course = commandLine[0];
            String student = commandLine[1];

            courseMap.putIfAbsent(course, new ArrayList<>());
            courseMap.get(course).add(student);

            command = scanner.nextLine();
        }


        for (Map.Entry<String, ArrayList<String>> entry : courseMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue().size());

            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }

        }


    }
}
