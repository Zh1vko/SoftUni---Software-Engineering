package _01_ClimbThePeaks;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> foodStack = new ArrayDeque<>();
        ArrayDeque<Integer> staminaQueue = new ArrayDeque<>();

        String[] foodInput = scanner.nextLine().split(",\\s+");
        String[] staminaInput = scanner.nextLine().split(",\\s+");
        List<String> conqueredPeaks = new LinkedList<>();

        for (String food : foodInput) {
            int currentFood = Integer.parseInt(food);
            foodStack.push(currentFood);
        }
        for (String stamina : staminaInput) {
            int currentStamina = Integer.parseInt(stamina);
            staminaQueue.offer(currentStamina);
        }

       List<Integer> mountainList = new ArrayList<>();
        mountainList.add(80);
        mountainList.add(90);
        mountainList.add(100);
        mountainList.add(60);
        mountainList.add(70);


        while (!mountainList.isEmpty() && !foodStack.isEmpty() && !staminaQueue.isEmpty()) {

            int currentDifficulty = mountainList.get(0);
            int currentResource = foodStack.pop() + staminaQueue.poll();

            if (currentResource >= currentDifficulty) {
                String mountainName = getMountainName(currentDifficulty);
                conqueredPeaks.add(mountainName);
                mountainList.remove(0);
            }
        }

        if (mountainList.isEmpty()) {
            System.out.println("Alex did it! He climbed all top five Pirin peaks in one week -> @FIVEinAWEEK");
        } else {
            System.out.println("Alex failed! He has to organize his journey better next time -> @PIRINWINS");
        }

        if (!conqueredPeaks.isEmpty()) {
            System.out.println("Conquered peaks:");
            for (String peak : conqueredPeaks) {
                System.out.println(peak);
            }
        }
    }

    public static String getMountainName(int difficulty) {
        String name = "";
        if (difficulty == 80) {
            name = "Vihren";
        }
        if (difficulty == 90) {
            name = "Kutelo";
        }
        if (difficulty == 100) {
            name = "Banski Suhodol";
        }
        if (difficulty == 60) {
            name = "Polezhan";
        }
        if (difficulty == 70) {
            name = "Kamenitza";
        }
    return name;
    }

}
