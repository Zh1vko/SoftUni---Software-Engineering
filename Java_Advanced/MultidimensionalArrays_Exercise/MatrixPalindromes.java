import java.util.Scanner;

public class MatrixPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split(" ")[0]);
        int cols = Integer.parseInt(input.split(" ")[1]);

        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                StringBuilder sb = new StringBuilder();

                char firstLetter = (char) (row + 97);
                char secondLetter = (char) (row + col + 97);
                sb.append(firstLetter);
                sb.append(secondLetter);
                sb.append(firstLetter);

                matrix[row][col] = sb.toString();

            }
        }


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                System.out.print(matrix[row][col] +" ");
            }
            System.out.println();
        }

    }
}
