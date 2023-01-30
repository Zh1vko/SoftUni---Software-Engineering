import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArray = Arrays.stream(scanner.nextLine().split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        TreeMap <Double, Integer> map = new TreeMap<>();

        for (int i = 0; i < numbersArray.length; i++) {
            double currentNum = numbersArray[i];

            map.putIfAbsent(currentNum, 0);
            map.put(currentNum, map.get(currentNum) + 1);
        }


        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
