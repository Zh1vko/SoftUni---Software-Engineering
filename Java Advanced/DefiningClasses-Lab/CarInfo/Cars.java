package _01_CarInfo;

public class Cars {

    private String Brand;
    private String Model;
    private int Horsepower;


    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getHorsepower() {
        return Horsepower;
    }

    public void setHorsepower(int horsepower) {
        Horsepower = horsepower;
    }

    @Override
    public String toString() {
        return "The car is: " + getBrand() + " " + getModel() + " - " + getHorsepower()+ " HP.";
    }
}
