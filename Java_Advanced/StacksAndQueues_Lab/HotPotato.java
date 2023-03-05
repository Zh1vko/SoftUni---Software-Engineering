import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameInput = scanner.nextLine();
        String[] names = nameInput.split(" ");
        ArrayDeque <String> nameQueue = new ArrayDeque<>();

        for (String name : names) {
            nameQueue.offer(name);
        }

        int n = Integer.parseInt(scanner.nextLine());


        while (nameQueue.size() > 1) {

            for (int i = 1; i < n; i++) {
                String currentName = nameQueue.poll();
                nameQueue.offer(currentName);
            }

            String removedName = nameQueue.pollFirst();
            System.out.println("Removed " + removedName);

        }
        String lastName = nameQueue.pollFirst();
        System.out.println("Last is " + lastName);
    }
}
