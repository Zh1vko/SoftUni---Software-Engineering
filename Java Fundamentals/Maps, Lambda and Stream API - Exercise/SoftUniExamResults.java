import java.sql.SQLOutput;
import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, Integer> languageCounter = new LinkedHashMap<>();
        Map<String, Integer> studentPoints = new LinkedHashMap<>();
        List<String> bannedList = new ArrayList<>();

        while (!input.equals("exam finished")) {
            String[] inputLine = input.split("-");


            if (!inputLine[1].equals("banned")) {
                String username = inputLine[0];

                if (bannedList.contains(username)) {
                    break;
                }

                String language = inputLine[1];
                int points = Integer.parseInt(inputLine[2]);
                languageCounter.putIfAbsent(language, 0);
                languageCounter.put(language, languageCounter.get(language) + 1);

                studentPoints.putIfAbsent(username, points);

                if (studentPoints.containsKey(username)) {
                    int previousPoints = studentPoints.get(username);
                    if (points > previousPoints) {
                        studentPoints.put(username, points);
                    }
                }
            }


            if (inputLine[1].equals("banned")) {
                String username = inputLine[0];
                studentPoints.remove(username);
                bannedList.add(username);
            }


            input = scanner.nextLine();
        }

        System.out.println("Results:");
        for (Map.Entry<String, Integer> student : studentPoints.entrySet()) {
            System.out.printf("%s | %d%n", student.getKey(), student.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> language : languageCounter.entrySet()) {
            System.out.printf("%s - %d%n", language.getKey(), language.getValue());
        }
    }
}
