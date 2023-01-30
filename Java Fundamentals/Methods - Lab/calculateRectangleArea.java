import java.util.Scanner;

public class calculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       int a = Integer.parseInt(scanner.nextLine());
       int b = Integer.parseInt(scanner.nextLine());
       int result = rectangleArea(a, b);

        System.out.println(result);
    }

    public static int rectangleArea (int width, int height) {
            return width * height;

    }
}
