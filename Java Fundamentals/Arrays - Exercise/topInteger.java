import java.util.Arrays;
import java.util.Scanner;

public class topInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < array.length; i++) {
            int currentElement = array[i];
            boolean isBigger = true;

            for (int j = i+1; j < array.length; j++) {
                   if (currentElement <= array[j]) {
                       isBigger = false;
                   }
            }

            if (isBigger) {
                System.out.print(array[i] + " ");
            }

        }
    }
}
