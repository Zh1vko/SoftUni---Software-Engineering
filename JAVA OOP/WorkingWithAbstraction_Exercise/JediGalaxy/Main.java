package JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int x = dimensions[0];
    int y = dimensions[1];
    int[][] matrix = new int[x][y];
    int value = 0;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
         }
    }

    String command = scanner.nextLine();
    long sum = 0;

        while (!command.equals("Let the Force be with you")) {
            int[] playerPosition = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilPosition = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int evilX = evilPosition[0];        // Evil character coordinates
            int evilY = evilPosition[1];

            int playerX = playerPosition[0];       // Player coordinates
            int playerY = playerPosition[1];

            while (evilX >= 0 && evilY >= 0) {
                if (evilX >= 0 && evilX < matrix.length && evilY >= 0 && evilY < matrix[0].length) {
                    matrix[evilX] [evilY] = 0;
                }
                evilX--;
                evilY--;
            }

            while (playerX >= 0 && playerY < matrix[1].length) {
                if (playerX >= 0 && playerX < matrix.length && playerY >= 0 && playerY < matrix[0].length) {
                    sum += matrix[playerX][playerY];
                }

                playerY++;
                playerX--;
            }
            command = scanner.nextLine();
        }

        System.out.println(sum);
    }
}


