import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];

        for (int rows = 0; rows < n; rows++) {
            String[] input = scanner.nextLine().split(" ");

            for (int cols = 0; cols < n; cols++) {
                matrix[rows][cols] = Integer.parseInt(input[cols]);
            }
        }

        int sumPrimary = 0;
        int sumSecondary = 0;

        for (int rows = 0; rows < n; rows++) {
            for (int cols = 0; cols < n; cols++) {
               if (rows == cols) {
                   sumPrimary+= matrix[rows][cols];
               }
            }
        }

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = matrix.length - 1; cols >= 0; cols--) {
               if (cols == matrix.length - 1 - rows) {
                   sumSecondary+= matrix[rows][cols];
               }
            }
        }

        System.out.println(Math.abs(sumPrimary-sumSecondary));

    }
}
