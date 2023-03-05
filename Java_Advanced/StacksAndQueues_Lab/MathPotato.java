import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameInput = scanner.nextLine();
        String[] names = nameInput.split(" ");
        PriorityQueue <String> nameQueue = new PriorityQueue<>();

        for (String name : names) {
            nameQueue.offer(name);
        }

        int n = Integer.parseInt(scanner.nextLine());
        int currentSteps = 1;

        while (nameQueue.size() > 1) {

            if (isPrime(currentSteps)) {
                String primeName = nameQueue.peek();
                System.out.println("Prime " + primeName);
            }
            else {
                String removedName = nameQueue.poll();
                System.out.println("Removed " + removedName);
            }

            currentSteps++;
            }

            String lastName = nameQueue.poll();
            System.out.println("Last is " + lastName);
    }

    public static boolean isPrime (int num) {

        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
