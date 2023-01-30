import java.util.*;

public class listProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<String> inputList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String product = scanner.nextLine();

            inputList.add(product);
        }

        Collections.sort(inputList);

        for (int i = 0; i < inputList.size(); i++) {
            System.out.println(i+1 + "." + inputList.get(i));
        }
    }
}
