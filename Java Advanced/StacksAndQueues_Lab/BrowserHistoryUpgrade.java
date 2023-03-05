import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> browserStack = new ArrayDeque<>();
        ArrayDeque<String> forwardStack = new ArrayDeque<>();

        while (!input.equals("Home")) {

            if (input.equals("back")) {
                if (browserStack.size() > 1) {
                    String backedURL = browserStack.pop();
                    System.out.println(browserStack.peek());
                    forwardStack.push(backedURL);
                } else {
                    System.out.println("no previous URLs");
                }
            }
            else if (input.equals("forward")) {
                    if (forwardStack.size() > 0) {
                        String forwardURL = forwardStack.pop();
                        browserStack.push(forwardURL);
                        System.out.println(forwardURL);
                    }
                    else {
                        System.out.println("no next URLs");
                    }
            }

            else {
                browserStack.push(input);
                System.out.println(browserStack.peek());
                forwardStack.clear();
            }

            input = scanner.nextLine();
        }
    }
}
