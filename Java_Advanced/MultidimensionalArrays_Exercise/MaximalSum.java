import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split(" ")[0]);
        int cols = Integer.parseInt(input.split(" ")[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String line = scanner.nextLine();
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(line.split(" ")[col]);
            }
        }
        int maximumSum = 0;
        int currentSum = 0;
        int[][] maximumMatrix = new int[3][3];

        for (int row = 0; row < rows-2; row++) {
            for (int col = 0; col < cols-2; col++) {
                int currentRow = matrix[row][col] + matrix[row][col+ 1] + matrix[row][col+2];
                int nextRow = matrix[row+1][col] + matrix[row+1][col+1] + matrix[row+1][col+2];
                int finalRow = matrix[row+2][col] + matrix[row+2][col+1] + matrix[row+2][col+2];

                currentSum = currentRow + nextRow + finalRow;

                if (currentSum > maximumSum) {
                    maximumSum = currentSum;


                    for (int maxRow = 0; maxRow < 3; maxRow++) {
                        for (int maxCol = 0; maxCol < 3; maxCol++) {
                            maximumMatrix[maxRow][maxCol] = matrix[maxRow+ row][maxCol + col];
                        }
                    }
                }

            }
        }

        System.out.println("Sum = "+ maximumSum);
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(maximumMatrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
