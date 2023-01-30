import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        LinkedHashMap<String, Double> quantityMap = new LinkedHashMap<>();
        LinkedHashMap<String, Double> priceMap = new LinkedHashMap<>();

        while (!command.equals("buy")) {
            String[] commandLine = command.split(" ");
            String name = commandLine[0];
            Double price = Double.parseDouble(commandLine[1]);
            Double quantity = Double.parseDouble(commandLine[2]);

            if (quantityMap.containsKey(name)) {
                quantityMap.put(name, quantityMap.get(name) + quantity);
            }
            quantityMap.putIfAbsent(name, quantity);


            priceMap.putIfAbsent(name, price);
            priceMap.put(name, price);

            command = scanner.nextLine();
        }

        LinkedHashMap <String, Double> finalMap = new LinkedHashMap<>();

        for (Map.Entry<String, Double> entry : priceMap.entrySet()) {
            double totalPrice = 0;
            Double price = entry.getValue();
            String name = entry.getKey();

            for (Map.Entry<String, Double> entry1 : quantityMap.entrySet()) {
                String name1 = entry1.getKey();
                Double quantity = entry1.getValue();
                if (name.equals(name1)) {
                    totalPrice = price * quantity;
                    finalMap.put(name, totalPrice);
                }
            }
        }

        for (Map.Entry<String, Double> entry : finalMap.entrySet()) {
            System.out.printf("%s -> %.2f%n",entry.getKey(), entry.getValue());
        }
    }
}
