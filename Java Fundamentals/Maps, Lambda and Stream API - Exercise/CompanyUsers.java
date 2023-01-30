import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();              // SoftUni -> AA12345
        LinkedHashMap <String, List<String>> companies = new LinkedHashMap<>();

        while (!input.equals("End")) {

            String[] data = input.split(" -> ");

            if (companies.containsKey(data[0])) {
                List <String> employees = companies.get(data[0]);
                if (!employees.contains(data[1])) {
                    employees.add(data[1]);
                }


            } else {
                List<String> employees = new ArrayList<>();
                employees.add(data[1]);
                companies.put(data[0], employees);
            }

            input = scanner.nextLine();
        }

       for (Map.Entry<String, List<String>> entry : companies.entrySet()) {
           System.out.println(entry.getKey());

           for (int i = 0; i < entry.getValue().size(); i++) {
               System.out.printf("-- %s%n", entry.getValue().get(i));
           }

       }
    }
}
