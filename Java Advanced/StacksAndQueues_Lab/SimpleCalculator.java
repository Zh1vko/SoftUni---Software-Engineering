import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputLine = input.split(" ");
        List<String> inputList = new ArrayList<>();
        inputList.addAll(Arrays.asList(inputLine));
        Collections.reverse(inputList);


        ArrayDeque<String> stack = new ArrayDeque<>();      // 2 + 5 + 10 - 2 - 1

        for (String s : inputList) {
            stack.push(s);
        }

        while (stack.size() > 1) {
            int firstNumber = Integer.parseInt(stack.peek());
            stack.pop();
            String op = stack.peek();
            stack.pop();
            int secondNumber = Integer.parseInt(stack.peek());
            stack.pop();
            int result;

            switch (op) {
                case "+":
                    result = firstNumber + secondNumber;
                    stack.push(result + "");
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    stack.push(result + "");
                    break;
            }
        }
        System.out.println(stack.peek());
    }
}
