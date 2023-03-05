import java.util.*;

public class ProductShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Map<String, Double>> shopInfo = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Revision")) {
                String[] inputLine = input.split(", ");
                String shopName = inputLine[0];
                String product = inputLine[1];
                double price = Double.parseDouble(inputLine[2]);

                shopInfo.putIfAbsent(shopName, new LinkedHashMap<>());
                shopInfo.get(shopName).put(product, price);

            input = scanner.nextLine();
        }

        for (String shop : shopInfo.keySet()) {
            System.out.println(shop+"->");
            for (String product : shopInfo.get(shop).keySet()) {
                double price = shopInfo.get(shop).get(product);

                System.out.printf("Product: %s, Price: %.1f%n", product, price);
            }
        }
    }
}
