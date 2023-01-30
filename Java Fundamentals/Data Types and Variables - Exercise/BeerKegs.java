import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kegs = Integer.parseInt(scanner.nextLine());
        double kegVolume = 0;
        double biggestVol = 0;
        String biggestName = "";

        for (int i = 1; i <= kegs; i++) {
            String name = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            kegVolume = Math.PI * (radius * radius) * height;

            if (kegVolume > biggestVol) {
                biggestVol = kegVolume;
                biggestName = name;
            }

        }
        System.out.println(biggestName);
    }
}
