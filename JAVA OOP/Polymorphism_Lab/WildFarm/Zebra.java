package WildFarm;

public class Zebra extends Mammal{

    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Zs");
    }

    @Override
    public void eat(Food food) {
        if (food instanceof Vegetable) {
            setFoodEaten(food.getQuantity()+getFoodEaten());
        } else {
            setFoodEaten(0+getFoodEaten());
            System.out.printf("%ss are not eating that type of food!%n", getAnimalType());
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
