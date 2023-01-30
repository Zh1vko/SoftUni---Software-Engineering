import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Pattern pattern2 = Pattern.compile("(^|(?<=\\s))((?<name>([A-z0-9]+)([\\.\\-_]?)([A-Za-z0-9]+))@(?<host>([a-zA-Z]+([\\.\\-][A-Za-z]+)+)))(\\b|(?=\\s))");
        Matcher matcher = pattern2.matcher(input);

        while (matcher.find()) {
            String user = matcher.group("name");
            String host = matcher.group("host");
            System.out.printf("%s@%s%n", user, host);
        }
    }
}
