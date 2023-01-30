import java.util.Arrays;
import java.util.Scanner;

public class arrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        String[] input = scanner.nextLine().split(" ");

        while (!input[0].equals("end")) {

                if (input[0].equals("swap")) {
                    int firstPosition = Integer.parseInt(input[1]);         // parsed swap1 index from stirng
                    int secondPosition = Integer.parseInt(input[2]);        // parsed swap2 index from string

                    int temporaryFirst = array[firstPosition];              // swap1 index value saved
                    int temporarySecond = array[secondPosition];            // swap2 index value saved

                    array[firstPosition] = temporarySecond;
                    array[secondPosition] = temporaryFirst;
                }

                if (input[0].equals("multiply")) {
                    int firstPosition = Integer.parseInt(input[1]);         // parsed swap1 index from stirng
                    int secondPosition = Integer.parseInt(input[2]);        // parsed swap2 index from string

                    array[firstPosition] = array[firstPosition] * array[secondPosition];

                }

                if (input[0].equals("decrease")) {

                    for (int i = 0; i < array.length; i++) {
                        array[i] -= 1;
                    }
                }
            input = scanner.nextLine().split(" ");
        }

        for (int i = 0; i < array.length; i++) {

            if (i == array.length-1) {
                System.out.print(array[i] + " ");
            } else {
                System.out.print(array[i] + ", ");
            }

        }
    }
}
