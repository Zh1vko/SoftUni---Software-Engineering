package EnterNumbers;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int start = 1;
            int end = 100;
            List<Integer> numberList = new LinkedList<>();

            while (numberList.size() < 10){
                try {
                    start = readNumber(start, end, scanner);
                    numberList.add(start);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Number!");
                } catch (IllegalStateException exception) {
                    System.out.println(exception.getMessage());
                }
            }

        System.out.println(numberList.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", ")));

    }

    public static int readNumber(int start, int end, Scanner scanner) {
            int number = Integer.parseInt(scanner.nextLine());
            if (!(start < number && number < end)) {
                throw new IllegalStateException("Your number is not in range " + start + " - 100!");
            }
            return number;
    }
}
