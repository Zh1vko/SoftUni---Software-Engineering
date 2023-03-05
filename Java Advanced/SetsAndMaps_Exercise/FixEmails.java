import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> map = new LinkedHashMap<>();
        int count = 1;
        String previousName = "";

        while (!input.equals("stop")) {

            if (count % 2 != 0) {
                previousName = input;
                map.put(previousName, "");
            }

            if (count % 2 == 0) {
                String email = input;
                map.put(previousName, email);
            }

            count++;
            input = scanner.nextLine();
        }



       for (String s : map.keySet()) {
           if (!map.get(s).contains(".us") && !map.get(s).contains(".uk") && !map.get(s).contains(".com")) {
               System.out.printf("%s -> %s%n", s, map.get(s));
           }
       }


    }
}
