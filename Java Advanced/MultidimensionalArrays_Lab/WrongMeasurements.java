import java.util.Arrays;
import java.util.Scanner;

public class WrongMeasurements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[][] inputMatrix = new int[n][];

        for (int i = 0; i < n; i++) {

            int row[] = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            inputMatrix[i] = row;
        }

        String[] coordinates = scanner.nextLine().split(" ");
        int row = Integer.parseInt(coordinates[0]);
        int col = Integer.parseInt(coordinates[1]);
        int wrongValue = inputMatrix[row][col];

        int[][] reworkedMatrix = new int[n][];

        for (int i = 0; i < inputMatrix.length; i++) {
            reworkedMatrix[i] = inputMatrix[i].clone();
        }

        for (int i = 0; i < inputMatrix.length; i++) {

            for (int j = 0; j < inputMatrix[i].length; j++) {
                if (reworkedMatrix[i][j] == wrongValue) {
                    reworkedMatrix[i][j] = getSum(inputMatrix, i, j, wrongValue);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < reworkedMatrix[i].length; j++) {
                System.out.print(reworkedMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int getSum (int[][] inputMatrix, int row, int col, int wrongValue) {
        int sum = 0;

        if (row - 1 >= 0 && inputMatrix[row - 1][col] != wrongValue) {
            sum += inputMatrix[row - 1][col];
        }

        if (row + 1 < inputMatrix.length && inputMatrix[row + 1][col] != wrongValue) {
            sum += inputMatrix[row + 1][col];
        }

        if (col - 1 >= 0 && inputMatrix[row][col - 1] != wrongValue) {
            sum += inputMatrix[row][col - 1];
        }

        if (col + 1 < inputMatrix[row].length && inputMatrix[row][col + 1] != wrongValue) {
            sum += inputMatrix[row][col + 1];
        }

        return sum;
    }
}
