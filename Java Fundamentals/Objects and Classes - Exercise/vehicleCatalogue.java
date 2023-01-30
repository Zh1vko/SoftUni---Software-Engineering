import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vehicleCatalogue {
        static class Vehicle {
            private String vehicleType;
            private String model;
            private String color;
            private int horsepower;

            public Vehicle(String vehicleType, String model, String color, int horsepower) {
                this.vehicleType = vehicleType;
                this.model = model;
                this.color = color;
                this.horsepower = horsepower;
            }

            public String getVehicleType() {
                return vehicleType;
            }

            public String getModel() {
                return model;
            }

            public String getColor() {
                return color;
            }

            public int getHorsepower() {
                return horsepower;
            }
        }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int countCars = 0;
        int countTrucks = 0;
        double totalHorsepowerCars = 0;
        double totalHorsepowerTrucks = 0;
        List<Vehicle> vehicleList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] commandLine = input.split(" ");
            String type = commandLine[0];
            String model = commandLine[1];
            String color = commandLine[2];
            int horsepower = Integer.parseInt(commandLine[3]);

            Vehicle currentVehicle = new Vehicle(type, model, color, horsepower);
            vehicleList.add(currentVehicle);


           if (type.equals("car")) {
               countCars++;
               totalHorsepowerCars += horsepower;
           } else {
               countTrucks++;
               totalHorsepowerTrucks += horsepower;
           }

            input = scanner.nextLine();
        }



        String models = scanner.nextLine();
        while (!models.equals("Close the Catalogue")) {
            for (int i = 0; i < vehicleList.size(); i++) {

                if (vehicleList.get(i).getModel().equals(models)) {
                    System.out.printf("Type: %s%n", vehicleList.get(i).getVehicleType().substring(0, 1).toUpperCase() + vehicleList.get(i).getVehicleType().substring(1));
                    System.out.printf("Model: %s%n", vehicleList.get(i).getModel());
                    System.out.printf("Color: %s%n", vehicleList.get(i).getColor());
                    System.out.printf("Horsepower: %d%n", vehicleList.get(i).getHorsepower());
                }


            }

            models = scanner.nextLine();
        }
        double averageCars = 0;
        double averageTrucks = 0;

        if (countCars != 0) {
            averageCars = totalHorsepowerCars / countCars;
        }

        if (countTrucks != 0) {
            averageTrucks = totalHorsepowerTrucks / countTrucks;
        }


        System.out.printf("Cars have average horsepower of: %.2f.%n", averageCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", averageTrucks);
    }
}
