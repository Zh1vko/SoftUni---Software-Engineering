import java.nio.file.NoSuchFileException;
import java.util.Scanner;

public class BackIn30minutes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int totalMinutes = hours * 60 + minutes + 30;

        int newHour = totalMinutes / 60;
        int newMinutes = totalMinutes % 60;

        if (newHour == 24) {
            newHour = 0;
        }

        System.out.printf("%d:%02d", newHour, newMinutes);
    }
}
