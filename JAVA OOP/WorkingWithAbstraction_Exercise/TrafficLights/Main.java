package TrafficLights;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] line = input.split(" ");
        List<String> lightsList = new LinkedList<>();

        for (String light : line) {
            lightsList.add(light);
        }

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < lightsList.size(); j++) {
                String currentLight = lightsList.get(j);

                if (currentLight.equals("RED")) {
                    lightsList.remove(j);
                    lightsList.add(j, "GREEN");
                    System.out.print(lightsList.get(j) + " ");
                } else if (currentLight.equals("GREEN")) {
                    lightsList.remove(j);
                    lightsList.add(j, "YELLOW");
                    System.out.print(lightsList.get(j) + " ");
                }
                else if (currentLight.equals("YELLOW")) {
                    lightsList.remove(j);
                    lightsList.add(j, "RED");
                    System.out.print(lightsList.get(j) + " ");
                }

            }
            System.out.println();
        }


    }
}
