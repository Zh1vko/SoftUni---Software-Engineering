import com.sun.source.tree.Tree;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");

            for (int j = 0; j < input.length; j++) {
                String currentCompound = input[j];
                if (!set.contains(currentCompound)) {
                    set.add(currentCompound);
                }
            }
        }

        set.forEach(e -> System.out.print(e + " "));
    }
}
