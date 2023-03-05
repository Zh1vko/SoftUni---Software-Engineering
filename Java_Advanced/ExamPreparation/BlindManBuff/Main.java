import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String playgroundSize = input.nextLine();

        int n = Integer.valueOf(playgroundSize.split(" ")[0]);
        int m = Integer.valueOf(playgroundSize.split(" ")[1]);
        char[][] playground = new char[n][m];

        int playerCount = 0;

        // x, y coords
        int[] playerPosition = new int[2];

        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            for (int j = 0; j < m; j++) {
                char nextChar = line.split(" ")[j].charAt(0);
                playground[i][j] = nextChar;

                if (playground[i][j] == 'P') {
                    playerCount++;
                }

                if (playground[i][j] == 'B') {
                    playerPosition[0] = i;
                    playerPosition[1] = j;
                }
            }
        }

        int moves = 0;
        int touchedOpponents = 0;

        String nextMove = input.nextLine();
        while (!nextMove.equals("Finish")) {
            int[] newPosition = getNextPosition(playerPosition, nextMove, n, m);
            boolean wall = didHitWall(playerPosition, nextMove, n, m);

            // Hits object, don't move to new position, do nothing
            // Or if hits wall, no thing (boolean wall)
            if (playground[newPosition[0]][newPosition[1]] == 'O'
                    || wall) {
            }
            // Hits other player
            else if (playground[newPosition[0]][newPosition[1]] == 'P') {
                touchedOpponents++;
                moves++;
                playground[newPosition[0]][newPosition[1]] = '-';
                playerPosition = newPosition;

                // All players found, exit
                if (touchedOpponents == playerCount) {
                    System.out.println("Game over!");
                    System.out.println("Touched opponents: " + touchedOpponents + " Moves made: " + moves);
                    break;
                }

            }
            // Just make the boring move
            else {
                moves++;
                playerPosition = newPosition;
            }
            nextMove = input.nextLine();
        }

        System.out.println("Game over!");
        System.out.println("Touched opponents: " + touchedOpponents + " Moves made: " + moves);
    }

    // Function to get next 'expected' position, ensuring its in the playground
    // bounds
    public static int[] getNextPosition(int[] currentPosition, String moveString, int n, int m) {
        int[] newPosition = currentPosition.clone();

        switch (moveString) {
            case "up":
                if (currentPosition[0] > 0) {
                    newPosition[0]--;
                }
                break;
            case "left":
                if (currentPosition[1] > 0) {
                    newPosition[1]--;
                }
                break;
            case "down":
                if (currentPosition[0] < n - 1) {
                    newPosition[0]++;
                }
                break;
            case "right":
                if (currentPosition[1] < m - 1) {
                    newPosition[1]++;
                }
                break;
        }

        return newPosition;
    }

    public static boolean didHitWall(int[] currentPosition, String moveString, int n, int m) {
        boolean hitWall = false;
        switch (moveString) {
            case "up":
                if (currentPosition[0] == 0) {
                    hitWall = true;
                }
                break;
            case "left":
                if (currentPosition[1] == 0) {
                    hitWall = true;
                }
                break;
            case "down":
                if (currentPosition[0] == n - 1) {
                    hitWall = true;
                }
                break;
            case "right":
                if (currentPosition[1] == m - 1) {
                    hitWall = true;
                }
                break;
        }

        return hitWall;
    }
}
