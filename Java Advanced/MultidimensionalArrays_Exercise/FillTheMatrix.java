import java.util.Scanner;

public class FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[n][n];

        if (pattern.equals("A")) {
            fillMatrixPatternA(matrix);

        } else if (pattern.equals("B")) {
            fillMatrixPatternB(matrix);

        }

        printMatrix(matrix);
    }

    public static void fillMatrixPatternA (int[][] matrix) {
            int startNumber = 1;

        for (int col = 0; col < matrix.length; col++) {

            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = startNumber;
                startNumber++;
            }
        }

    }

    public static void fillMatrixPatternB (int[][] matrix) {
        int startNumber = 1;

        for (int col = 0; col < matrix.length; col++) {
            if ((col + 1) % 2  == 0) {
                for (int row = matrix.length-1; row >= 0; row--) {
                    matrix[row][col] = startNumber;
                    startNumber++;
                }
            }
            else {
                for (int rows = 0; rows < matrix.length; rows++) {
                    matrix[rows][col] = startNumber;
                    startNumber++;
                }
            }
        }


    }

    public static void printMatrix (int[][] matrix) {

        for (int rows = 0; rows < matrix.length; rows++) {
            for (int cols = 0; cols < matrix.length; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
