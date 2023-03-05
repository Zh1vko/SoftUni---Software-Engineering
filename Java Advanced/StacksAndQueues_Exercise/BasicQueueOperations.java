import java.util.*;
import java.util.stream.Collectors;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque <Integer> queue = new ArrayDeque<>();

        int pushElements = scanner.nextInt();
        int removeElements = scanner.nextInt();
        int checkElement = scanner.nextInt();

        for (int i = 1; i <= pushElements; i++) {
            queue.offer(scanner.nextInt());
        }

        for (int i = 1; i <= removeElements; i++) {
            queue.poll();
        }

        if (queue.contains(checkElement)) {
            System.out.println("true");
        } else if (queue.size() == 0) {
            System.out.println("0");
        } else {
            System.out.println(Collections.min(queue));
        }

    }
}

