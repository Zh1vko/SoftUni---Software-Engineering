import java.util.Scanner;

public class zigZagArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // n amount of pairs for 2 arrays

        int n = Integer.parseInt(scanner.nextLine());

        String[] array1 = new String[n];
        String[] array2 = new String[n];

        for (int i = 0; i < array1.length; i++) {
            String[] current = scanner.nextLine().split(" ");

            if (i == 0) {
                array1[i] = current[0];
                array2[i] = current[1];
            }
            if (i != 0 && (i+1) % 2 == 0){
                array1[i] = current[1];
                array2[i] = current[0];
            }
            else if (i != 0 && (i+1) % 2 != 0) {
                array1[i] = current[0];
                array2[i] = current[1];
            }

        }

        for (int i = 0; i < array1.length; i++) {

            System.out.print(array1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {

            System.out.print(array2[i] + " ");
        }

    }
}
