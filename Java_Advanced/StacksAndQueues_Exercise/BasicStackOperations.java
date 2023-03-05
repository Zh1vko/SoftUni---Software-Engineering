import java.util.ArrayDeque;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();

        String[] dataLine = data.split(" ");
        int elementsNumber = Integer.parseInt(dataLine[0]);
        int popElements = Integer.parseInt(dataLine[1]);
        int checkElement = Integer.parseInt(dataLine[2]);

        String input = scanner.nextLine();
        String[] inputLine = input.split("\\s+");

        ArrayDeque <Integer> stack = new ArrayDeque<>();

        for (String s : inputLine) {
            int currentElement = Integer.parseInt(s);
            stack.push(currentElement);
        }

        if (stack.size() > 0) {
            for (int i = 0; i < popElements; i++) {
                stack.pop();
            }
        }

        if (stack.size() == 0) {
            System.out.println("0");
        }

        else if (stack.contains(checkElement)) {
            System.out.println("true");
        }
        else {
            int smallestElement = stack.pop();
            if (stack.size() > 0) {

                for (int n : stack) {
                    int currentElement = stack.pop();
                    if (currentElement < smallestElement) {
                        smallestElement = currentElement;
                    }
                }
            }
            System.out.println(smallestElement);
        }

    }
}
