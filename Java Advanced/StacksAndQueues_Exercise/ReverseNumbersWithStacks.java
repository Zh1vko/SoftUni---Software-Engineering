import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersWithStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputLine = input.split(" ");
        ArrayDeque <Integer> stack = new ArrayDeque<>();

        for (String s : inputLine) {
            int currentNum = Integer.parseInt(s);
            stack.push(currentNum);
        }

        for (int n : stack) {
            System.out.print(stack.pop() + " ");
        }
    }
}
