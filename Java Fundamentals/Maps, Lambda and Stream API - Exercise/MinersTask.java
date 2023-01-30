import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinersTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int counter = 0;
        LinkedHashMap <String, Integer> resourceMap = new LinkedHashMap<>();
        String key = "";
        while (!command.equals("stop")) {
            counter++;

            int value = 0;

            if (counter % 2 != 0) {
                key = command;
                resourceMap.putIfAbsent(key, 0);
            } else {
                value = Integer.parseInt(command);
                resourceMap.put(key, resourceMap.get(key) + value);
            }

            command = scanner.nextLine();
        }

      for (Map.Entry<String, Integer> entry : resourceMap.entrySet()) {
          System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
      }
    }
}
