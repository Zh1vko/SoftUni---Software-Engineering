import java.util.Scanner;

public class smallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());

        System.out.println(smallestNum(firstNum, secondNum, thirdNum));
    }

    public static int smallestNum (int a, int b, int c) {
            int smallestNum = Integer.MAX_VALUE;

       if (smallestNum > a) {
           smallestNum = a;
       }
       if (smallestNum > b) {
           smallestNum = b;
       }
       if (smallestNum > c) {
           smallestNum = c;
       }
    return smallestNum;
    }
}
