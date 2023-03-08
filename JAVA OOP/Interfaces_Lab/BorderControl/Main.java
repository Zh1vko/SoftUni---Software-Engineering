package BorderControl;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> idList = new LinkedList<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] inputLine = input.split(" ");

            if (inputLine.length == 3) {
                String name = inputLine[0];
                int age = Integer.parseInt(inputLine[1]);
                String id = inputLine[2];
                Citizen currentCitizen = new Citizen(name, age, id);
                idList.add(currentCitizen.getId());


            }
            else if (inputLine.length == 2) {
                String model = inputLine[0];
                String id = inputLine[1];
                Robot currentRobot = new Robot(model, id);
                idList.add(currentRobot.getId());
            }

            input = scanner.nextLine();
        }

        String fakeDigits = scanner.nextLine();

       for (String id : idList) {
           int subsetLength = fakeDigits.length();

           if (id.length() >= subsetLength) {
               String currentSubset = id.substring(id.length() - subsetLength);
                    if (currentSubset.equals(fakeDigits)) {
                        System.out.println(id);
                    }
           }
       }
    }
}
