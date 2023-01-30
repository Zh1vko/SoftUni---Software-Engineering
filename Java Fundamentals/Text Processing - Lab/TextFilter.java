import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] bannedList = scanner.nextLine().split(", ");
        String text = scanner.nextLine();


        for (int i = 0; i < bannedList.length; i++) {
            String currentWord = bannedList[i];
            int wordLength = currentWord.length();

            while (text.contains(currentWord)) {
                String result = charMaker(wordLength);

                text = text.replace(currentWord, result);
            }
        }
        System.out.println(text);

    }
    public static String charMaker (int length) {
        String result = "";

        for (int i = 0; i < length; i++) {
            result += '*';
        }
        return result;
    }

}
