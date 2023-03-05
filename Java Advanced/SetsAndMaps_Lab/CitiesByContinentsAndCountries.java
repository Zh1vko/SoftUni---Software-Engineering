import java.util.*;
import java.util.stream.Collectors;

public class CitiesByContinentsAndCountries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> continentMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();          // Europe Bulgaria Sofia
            String continent = input.split(" ")[0];
            String country = input.split(" ")[1];
            String city = input.split(" ")[2];

            continentMap.putIfAbsent(continent, new LinkedHashMap<>());
            continentMap.get(continent).putIfAbsent(country, new LinkedList<>());
            continentMap.get(continent).get(country).add(city);
        }


      for (String continent : continentMap.keySet()) {
          System.out.println(continent + ": ");

          for (String city : continentMap.get(continent).keySet()) {
              System.out.printf("%s -> ", city);

              List<String> currentArray = continentMap.get(continent).get(city);
              System.out.println(currentArray.stream()
                      .collect(Collectors.joining(", ")));
          }

      }



    }
}
