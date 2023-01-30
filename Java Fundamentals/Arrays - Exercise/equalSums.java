import java.util.Arrays;
import java.util.Scanner;

public class equalSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isEqual = false;
        int leftSum = 0;

        for (int i = 0; i < array.length; i++) {

            int rightSum = 0;
            for (int j = i+1; j < array.length; j++) {
                rightSum += array[j];

            }

            if (leftSum == rightSum) {
                System.out.print(i + " ");
                isEqual = true;
            }

            leftSum+= array[i];
        }

        if (!isEqual) {
            System.out.println("no");
        }
    }
}
