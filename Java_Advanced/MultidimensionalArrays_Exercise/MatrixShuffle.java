import java.util.Scanner;
import java.util.regex.Pattern;

public class MatrixShuffle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int rows = Integer.parseInt(input.split(" ")[0]);
        int cols = Integer.parseInt(input.split(" ")[1]);

        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            String inputs = scanner.nextLine();
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = inputs.split(" ")[j];
            }
        }

        String command = scanner.nextLine();

        while (!command.equals("END")) {

            if (command.contains("swap")) {
            String[] commandLine = command.split(" ");

            if (isValidated(commandLine, matrix)) {

                swapMethod(commandLine, matrix);
                printMatrix(matrix);

            } else {
                System.out.println("Invalid input!");
             }
            }

            else {
                System.out.println("Invalid input!");
            }

            command = scanner.nextLine();
        }

    }

    public static boolean isValidated (String[] command, String[][] matrix) {

        if (command.length != 5) {
            return false;
        }

        int firstRow = Integer.parseInt(command[1]);
        int firstColum = Integer.parseInt(command[2]);
        int secondRow = Integer.parseInt(command[3]);
        int secondColum = Integer.parseInt(command[4]);

        if (matrix.length < firstRow || matrix.length < secondRow) {
            return false;
        }

        if (matrix[0].length < firstColum || matrix[0].length < secondColum) {
            return false;
        }
        
        return true;
    }


    public static void swapMethod (String[] command, String[][] matrix) {

        int firstRow = Integer.parseInt(command[1]);
        int firstColum = Integer.parseInt(command[2]);
        int secondRow = Integer.parseInt(command[3]);
        int secondColum = Integer.parseInt(command[4]);

        String firstSwap = matrix[firstRow][firstColum];
        String secondSwap = matrix[secondRow][secondColum];

        matrix[secondRow][secondColum] = firstSwap;
        matrix[firstRow][firstColum] = secondSwap;

    }

    public static void printMatrix (String[][] matrix) {

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
