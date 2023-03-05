import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> userSet = new LinkedHashSet<>();

        for (int i = 0; i < n; i++) {
            String currentName = scanner.nextLine();
            if (!userSet.contains(currentName)) {
                userSet.add(currentName);
            }
        }

        for (String s : userSet) {
            System.out.println(s);
        }
    }
}
