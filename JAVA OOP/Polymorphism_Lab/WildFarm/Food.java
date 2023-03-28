package WildFarm;

public abstract class Food {

    Integer quantity;

    public Integer getQuantity() {
        return quantity;
    }

    public Food(Integer quantity) {
        this.quantity = quantity;
    }
}
