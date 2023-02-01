package _01_CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Cars> carList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            Cars car = new Cars();
            String[] inputLine = scanner.nextLine().split("\\s+");
            String brand = inputLine[0];
            String model = inputLine[1];
            int horsePower = Integer.parseInt(inputLine[2]);

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsepower(horsePower);

            carList.add(car);
        }


        for (int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).toString());
        }
    }
}
