import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class adjacentNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());


        for (int i = 0; i < numbersList.size()-1; i++) {
            double currentNum = numbersList.get(i);
            double nextNum = numbersList.get(i+1);

            if (currentNum == nextNum) {
                numbersList.set(i, currentNum + currentNum);
                numbersList.remove(i+1);
                i = -1;
            }
        }

        System.out.println(numbersPrinter(numbersList, " "));
    }
    public static String numbersPrinter (List <Double> list, String delimiter) {
        String result = "";
        DecimalFormat number = new DecimalFormat("0.#");

        for (double item:list) {
            String value = number.format(item);
            result += value + delimiter;
        }

        return result;

    }
}
