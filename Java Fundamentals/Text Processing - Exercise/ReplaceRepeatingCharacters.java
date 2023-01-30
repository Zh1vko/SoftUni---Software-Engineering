import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceRepeatingCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] charArray = scanner.nextLine().toCharArray();
        List<Character> finalList = new ArrayList<>();

        for (int i = 0; i < charArray.length; i++) {
            finalList.add(charArray[i]);
        }

        for (int i = 1; i < finalList.size(); i++) {
            char oldChar = finalList.get(i-1);
            char currentChar = finalList.get(i);

            if (oldChar == currentChar) {
                finalList.remove(i);
                i--;
            }
        }

       for (char entry : finalList) {
           System.out.printf("%c", entry);
       }
    }
}
