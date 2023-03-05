package ArraySum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println(getSum(array, 0));

    }

    private static int getSum (int[] array, int index) {
        if (index >= array.length) {
            return 0;
        }
        return array[index] + getSum(array, index + 1);
    }

}
