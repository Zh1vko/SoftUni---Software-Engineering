import java.util.Arrays;
import java.util.Scanner;

public class magicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int magicNum = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < numbers.length; i++) {
            int currentElement = numbers[i];

            for (int j = i+1; j < numbers.length; j++) {

                if ((currentElement + numbers[j]) == magicNum) {
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }


        }


    }
}
