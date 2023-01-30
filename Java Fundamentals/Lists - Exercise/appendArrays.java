import java.util.*;
import java.util.stream.Collectors;

public class appendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List <String> inputLine = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        Collections.reverse(inputLine);


        System.out.println(inputLine.toString().replace("[", "").replace("]", "").trim().replaceAll(",", "")
                .replaceAll("\\s+", " "));

        }
    }

