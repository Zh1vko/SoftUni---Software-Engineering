import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> charMap = new TreeMap<>();
        String input = scanner.nextLine();
        char[] charArr = input.toCharArray();

        for (int i = 0; i < charArr .length; i++) {
            char currentChar = input.charAt(i);
            charMap.putIfAbsent(currentChar, 0);
            charMap.put(currentChar, charMap.get(currentChar) + 1);
        }


     for (Character c : charMap.keySet()) {
         int currentTimes = charMap.get(c);
         System.out.printf("%c: %d time/s%n", c, currentTimes);
     }
    }
}
