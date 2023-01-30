import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        StringBuilder password = new StringBuilder(username).reverse();
        String attempt = scanner.nextLine();
        int tries = 0;

        while (!attempt.contentEquals(password)) {
            tries++;
            if (tries >= 4) {
                System.out.printf("User %s blocked!", username);
                return;
            }

            System.out.println("Incorrect password. Try again.");
            attempt = scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);

    }
}
