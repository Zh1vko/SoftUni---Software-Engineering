import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        Map<String, String> peopleList = new LinkedHashMap<>();


        for (int i = 0; i < people; i++) {
            String[] currentPerson = scanner.nextLine().split(" ");
            String operation = currentPerson[0];
            String name = currentPerson[1];


            switch (operation) {

                case "register":
                    String licensePlate = currentPerson[2];
                    if (peopleList.containsKey(name)) {
                        System.out.printf("ERROR: already registered with plate number %s%n", peopleList.get(name));
                        break;
                    } else {
                        peopleList.putIfAbsent(name, licensePlate);
                        System.out.printf("%s registered %s successfully%n", name, licensePlate);
                    }
                    break;

                case "unregister":

                    if (!peopleList.containsKey(name)) {
                        System.out.printf("ERROR: user %s not found%n", name);
                        break;
                    } else {
                        System.out.printf("%s unregistered successfully%n", name);
                        peopleList.remove(name);
                    }
                    break;
            }
        }

            for (Map.Entry<String, String> entry : peopleList.entrySet()) {
                System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
            }

    }
}
