package ApocalypsePreparation;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> textilesQueue = new ArrayDeque<>();
        ArrayDeque<Integer> medicamentStack = new ArrayDeque<>();
        String[] textileInput = scanner.nextLine().split(" ");
        String[] medicamentInput = scanner.nextLine().split(" ");
        Map<String, Integer> healing = new HashMap<>();
        Map<String, Integer> items = new TreeMap<>();

        for (int i = 0; i < textileInput.length; i++) {
            int currentTextile = Integer.parseInt(textileInput[i]);
            textilesQueue.offer(currentTextile);
        }

        for (int i = 0; i < medicamentInput.length; i++) {
            int currentMedicament = Integer.parseInt(medicamentInput[i]);
            medicamentStack.push(currentMedicament);
        }

        int medKitCounter = 0;
        int bandageCounter = 0;
        int patchCounter = 0;
        while (!textilesQueue.isEmpty() && !medicamentStack.isEmpty()) {
            int currentTextile = textilesQueue.poll();
            int currentMedicament = medicamentStack.pop();
            int currentHealingSum = currentTextile + currentMedicament;


            if (currentHealingSum > 100) {
                medKitCounter++;
                int remainingSum = currentHealingSum - 100;
                int nextMedicament = medicamentStack.pop() + remainingSum;
                medicamentStack.push(nextMedicament);
                healing.putIfAbsent("MedKit", 0);
                healing.put("MedKit", healing.get("MedKit") + 1);
            }

             else if (currentHealingSum == 100) {
                medKitCounter++;
                healing.putIfAbsent("MedKit", 0);
                healing.put("MedKit", healing.get("MedKit") + 1);
            } else if (currentHealingSum == 40) {
                bandageCounter++;
                healing.putIfAbsent("Bandage", 0);
                healing.put("Bandage", healing.get("Bandage") + 1);
            } else if (currentHealingSum == 30) {
                healing.putIfAbsent("Patch", 0);
                healing.put("Patch", healing.get("Patch") + 1);
                patchCounter++;
            } else {
                 currentMedicament += 10;
                 medicamentStack.push(currentMedicament);
            }

        }
      if (textilesQueue.isEmpty() && medicamentStack.isEmpty()) {
          System.out.println("Textiles and medicaments are both empty.");
      }
      else if (textilesQueue.isEmpty() && !medicamentStack.isEmpty()) {
          System.out.println("Textiles are empty.");

      }
      else if (medicamentStack.isEmpty() && !textilesQueue.isEmpty()) {
          System.out.println("Medicaments are empty.");
      }


        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(healing.entrySet());

        // Sort the entries by value (amount created) in descending order -> then by key (name) alphabetically (natural order?)
        Collections.sort(sortedEntries, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
                int compareResult = e2.getValue().compareTo(e1.getValue()); // descending order by value
                if (compareResult == 0) {       // Ако стойностите са равни -> Сравнявам имената
                    compareResult = e1.getKey().compareTo(e2.getKey()); // възходящ ред по ключ
                }
                return compareResult;
            }
        });


        for (Map.Entry<String, Integer> entry : sortedEntries) {
            if (entry.getValue() > 0) {
                System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
            }
        }

          if  (textilesQueue.isEmpty() && !medicamentStack.isEmpty()) {                 // medicament remaining
            StringBuilder sb = new StringBuilder();
            sb.append(medicamentStack.pop());
             while (!medicamentStack.isEmpty()) {
                 sb.append(", ");
                 sb.append(medicamentStack.pop());
             }

              System.out.println("Medicaments left: " + sb);
        }
        else if (medicamentStack.isEmpty() && !textilesQueue.isEmpty()) {   // textiles remaining
              StringBuilder sb = new StringBuilder();
              sb.append(textilesQueue.poll());

            while (!textilesQueue.isEmpty()) {
                while (!textilesQueue.isEmpty()) {
                    sb.append(", ");
                    sb.append(textilesQueue.poll());
                }
            }
              System.out.println("Textiles left: " + sb);
        }

    }
}
