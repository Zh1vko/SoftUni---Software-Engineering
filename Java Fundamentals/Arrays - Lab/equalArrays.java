import java.util.Arrays;
import java.util.Scanner;

public class equalArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array1 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] array2 = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        int wrongIndex = 0;
        boolean isEqual = true;
        int sum = 0;

        for (int i = 0; i < array1.length; i++) {

            if (array1[i] == array2[i]) {
                isEqual = true;
                sum += array1[i];

            } else {
                isEqual = false;
                wrongIndex = i;
                break;
            }
        }

        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", wrongIndex);
        }
    }
}
