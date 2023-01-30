import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class houseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestsList = new ArrayList<>();


        for (int i = 1; i <= n; i++) {
            List <String> commandLine = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            String name = commandLine.get(0);

            if (commandLine.size() == 3) {
                if (guestsList.contains(name)) {
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    guestsList.add(name);
                }
            }

            else if (commandLine.size() == 4) {
                if (guestsList.contains(name)) {
                    guestsList.remove(name);
                } else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }

        for (String name:
             guestsList) {
            System.out.println(name);
        }
    }
}
