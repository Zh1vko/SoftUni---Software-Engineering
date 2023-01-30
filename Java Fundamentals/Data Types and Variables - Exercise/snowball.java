import java.util.Scanner;

public class snowball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());       // snowballs
        double biggestSnowball = 0;
        double biggestSnow = 0;
        double biggestTime = 0;
        double biggestQuality = 0;

        for (int i = 1; i <= N; i++) {
            double snowballSnow = Double.parseDouble(scanner.nextLine());
            double snowballTime = Double.parseDouble(scanner.nextLine());
            double snowballQuality = Double.parseDouble(scanner.nextLine());

            double quickMaths = (snowballSnow / snowballTime);
            double snowballVolume = Math.pow(quickMaths, snowballQuality);

            if (snowballVolume > biggestSnowball) {
                biggestSnowball = snowballVolume;
                biggestSnow = snowballSnow;
                biggestTime = snowballTime;
                biggestQuality = snowballQuality;
            }
        }
        System.out.printf("%.0f : %.0f = %.0f (%.0f)", biggestSnow, biggestTime, biggestSnowball, biggestQuality);

    }
}
