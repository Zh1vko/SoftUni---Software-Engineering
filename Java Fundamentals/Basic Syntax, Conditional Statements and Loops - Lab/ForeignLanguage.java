import java.util.Scanner;

public class ForeignLanguage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // English - USA,England
        //Spanish - Spain, Argentina, Mexico
        // others - unknown

        String country = scanner.nextLine();

        switch (country) {
            case "USA":
            case "England":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
