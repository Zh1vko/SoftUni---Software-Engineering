import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int rows = 1; rows <= n ; rows++) {
            for (int lines = 1; lines <= rows ; lines++) {
                System.out.print(rows + " ");
            }
            System.out.println();
        }
    }
}
