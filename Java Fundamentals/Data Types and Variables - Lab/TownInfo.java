import java.util.Scanner;

public class TownInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        int population = Integer.parseInt(scanner.nextLine());
        int areaCode = Integer.parseInt(scanner.nextLine());

        //"Town {town name} has population of {population} and area {area} square km.".

        System.out.printf("Town %s has population of %d and area %d square km.", town, population, areaCode);
    }
}
