import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, String> phonebook = new LinkedHashMap<>();


        while (!input.equals("search")) {
            String[] inputLine = input.split("-");
            String name = inputLine[0];
            String phoneNumber = inputLine[1];

            if (phonebook.containsKey(name)) {
                phonebook.put(name, phoneNumber);
            } else {
                phonebook.put(name, phoneNumber);
            }

            input = scanner.nextLine();
        }

        String searchCommand = scanner.nextLine();

        while (!searchCommand.equals("stop")) {

            if (phonebook.containsKey(searchCommand)) {
                System.out.printf("%s -> %s%n", searchCommand, phonebook.get(searchCommand));
            } else {
                System.out.printf("Contact %s does not exist.%n", searchCommand);
            }


            searchCommand = scanner.nextLine();
        }



    }
}
