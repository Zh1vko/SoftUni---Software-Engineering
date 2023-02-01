package _02_CarConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] inputLine = scanner.nextLine().split(" ");
            String brand = inputLine[0];

            if (inputLine.length < 2) {
                Car car = new Car(brand);
                carList.add(car);
            } else {
                String model = inputLine[1];
                int hp = Integer.parseInt(inputLine[2]);
                Car car = new Car(brand, model, hp);
                carList.add(car);
            }
        }

        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).toString());
        }
    }
}
