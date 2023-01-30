import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ">>{furniture name}<<{price}!{quantity}"

        String input = scanner.nextLine();
        List<String> furnitureList = new ArrayList<>();

        double totalSum = 0;

        while (!input.equals("Purchase")) {

            Pattern pattern = Pattern.compile(">>\\b(?<furniture>\\w+)<<(?<price>[0-9]+(?:[.]?[0-9]+))!(?<quantity>[0-9]+)\\b");
            Matcher matcher = pattern.matcher(input);

                while (matcher.find()) {
                    String furnitureName = matcher.group("furniture");
                    Double price = Double.parseDouble(matcher.group("price"));
                    int quantity = Integer.parseInt(matcher.group("quantity"));
                    furnitureList.add(furnitureName);
                    totalSum += quantity * price;
                }

            input = scanner.nextLine();
        }

        System.out.println("Bought furniture:");
        for (String entry : furnitureList) {
            System.out.println(entry);
        }
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
