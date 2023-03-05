import java.util.Scanner;

public class example {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(inputLine[col]);
            }
        }


        int row = rows - 1;
        int col = cols -1;

        while (row  != -1) {

            int c = col;
            int r = row;

            while (c < cols && r >= 0) {
                System.out.println(matrix[r--][c++]);
            }

            System.out.println();
            col--;

            if (col == -1) {
                col = 0;
                row--;
            }
        }
    }
}
