import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> numberMap = new LinkedHashMap<>();

        String[] inputLine = scanner.nextLine().split(" ");

        for (int i = 0; i < inputLine.length; i++) {
            double currentNumber = Double.parseDouble(inputLine[i]);
            numberMap.putIfAbsent(currentNumber, 0);

            if (numberMap.containsKey(currentNumber)) {
                numberMap.put(currentNumber, numberMap.get(currentNumber) + 1);
            }
        }


        for (Double key : numberMap.keySet()) {
            System.out.printf("%.1f -> %d%n", key, numberMap.get(key));
        }

    }
}
