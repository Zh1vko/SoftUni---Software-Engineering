package WildFarm;

public class Mammal extends Animal{

    String livingRegion;

    public Mammal(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight);
        this.livingRegion = livingRegion;
    }

    public String getLivingRegion() {
        return livingRegion;
    }

    @Override
    void makeSound() {

    }

    @Override
    void eat(Food food) {

    }

    @Override
    public String toString() {
        return String.format(super.toString()+"%s, %d]",getLivingRegion(),getFoodEaten());
    }
}
