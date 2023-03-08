package FoodShortage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        Map<String, String> peopleMap = new LinkedHashMap<>();

        for (int i = 0; i < peopleCount; i++) {
            String[] data = scanner.nextLine().split(" ");

            if (data.length == 4) {
               String name = data[0];
               int age = Integer.parseInt(data[1]);
               String id = data[2];
               String birthdate = data[3];

               Citizen currentCitizen = new Citizen(name, age, id, birthdate);
               peopleMap.put(name, "Citizen");
            }
            else if (data.length == 3) {
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                String group = data[2];

                Rebel currentRebel = new Rebel(name, age, group);
                peopleMap.put(name, "Rebel");
            }
        }

        int totalFood = 0;

        String name = scanner.nextLine();
        while (!name.equals("End")) {
            if (peopleMap.containsKey(name)) {
                if (peopleMap.get(name).equals("Citizen")) {
                    totalFood += 10;
                }
                else if (peopleMap.get(name).equals("Rebel")) {
                    totalFood += 5;
                }
            }

            name = scanner.nextLine();
        }

        System.out.println(totalFood);
    }
}
