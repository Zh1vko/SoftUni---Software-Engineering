import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberMessages = Integer.parseInt(scanner.nextLine());
        int destroyedPlanets = 0;
        int attackedPlanets = 0;
        List<String> attackedNames = new LinkedList<>();
        List<String> destroyedNames = new LinkedList<>();

        for (int i = 0; i < numberMessages; i++) {

            String message = scanner.nextLine();                // STCDoghudd4=63333$D$0A53333
            int messageCounter = wordCounter(message);
            String editedMessage = AsciiRemake(message, messageCounter);        // DECRYPTED Message
            Pattern pattern = Pattern.compile("@(?<name>[A-Za-z]+)[^@,\\-!:>]*:(?<population>\\d+)[^@,\\-!:>]*!(?<AttackType>[A|D])![^@,\\-!:>]*->(?<SoldierCount>\\d+)");
            Matcher matcher = pattern.matcher(editedMessage);

            while (matcher.find()) {
                String planetName = matcher.group("name");
                String attack = matcher.group("AttackType");

                if (attack.equals("D")) {
                    destroyedNames.add(planetName);
                    destroyedPlanets++;
                } else if (attack.equals("A")) {
                    attackedNames.add(planetName);
                    attackedPlanets++;
                }
            }
        }
        Collections.sort(attackedNames);
        Collections.sort(destroyedNames);

        System.out.printf("Attacked planets: %d%n", attackedPlanets);
        for (String entry : attackedNames) {
            System.out.printf("-> %s%n", entry);
        }
        System.out.printf("Destroyed planets: %d%n", destroyedPlanets);
        for (String entry : destroyedNames) {
            System.out.printf("-> %s%n", entry);
        }
    }







    public static int wordCounter (String text) {

        Pattern pattern = Pattern.compile("(?i)[star]");
        Matcher matcher = pattern.matcher(text);
        int counter = 0;

        while (matcher.find()) {
            counter++;
        }
        return counter;
    }

    public static String AsciiRemake (String text, int counter) {
        StringBuilder result = new StringBuilder();                     // append the chars
        char[] charArray = text.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            char editedChar = (char) (currentChar - counter);               //edited char (subtract counter)
            result.append(editedChar);
        }
        return result.toString();
    }
}
