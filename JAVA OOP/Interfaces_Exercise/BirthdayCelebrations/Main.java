package BirthdayCelebrations;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> birthdayList = new LinkedList<>();

        while (!input.equals("End")) {
        String[] inputLine = input.split(" ");
        String objectType = inputLine[0];

        switch (objectType) {
            case "Citizen":
                String name = inputLine[1];
                int age = Integer.parseInt(inputLine[2]);
                String id = inputLine[3];
                String birthday = inputLine[4];

                Citizen currentCitizen = new Citizen(name, age, id, birthday);
                birthdayList.add(currentCitizen.getBirthDate());
                //TODO: Add current problem logic
                break;

            case "Robot":
                String model = inputLine[1];
                String robotId = inputLine[2];

                Robot currentRobot = new Robot(model, robotId);
                break;

            case "Pet":
                String petName = inputLine[1];
                String petBirthday = inputLine[2];

                Pet currentPet = new Pet(petName, petBirthday);
                birthdayList.add(currentPet.getBirthDate());
                break;

            default: break;
        }

            input = scanner.nextLine();
        }

        String requiredYear = scanner.nextLine();

        for (String birthday : birthdayList) {
            String[] data = birthday.split("/");
            String currentYear = data[2];

            if (requiredYear.equals(currentYear)) {
                System.out.println(birthday);
            }
        }
    }
}
