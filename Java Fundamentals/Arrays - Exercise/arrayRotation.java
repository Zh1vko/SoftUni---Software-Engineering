import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] array = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String currentElement = "";
            currentElement = array[0];

            for (int j = 0; j < array.length-1; j++) {
            array[j] = array[j+1];
            }

            array[array.length-1] = currentElement;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
