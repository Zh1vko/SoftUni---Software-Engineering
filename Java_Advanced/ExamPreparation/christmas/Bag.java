package christmas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Bag {

    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }

    public int count() {
        return data.size();
    }

    public void add(Present present) {
        if (this.count() < this.getCapacity()) {
            this.data.add(present);
        } else {
            throw new IllegalStateException("No more space");
        }
    }

    public boolean remove (String name) {
       return this.data.removeIf(Present -> Present.getName().equals(name));
    }

    public Present heaviestPresent() {
      return this.data.stream().max(Comparator.comparing(Present::getWeight)).orElse(null);
    }

    public Present getPresent(String name) {
       return this.data.stream().filter(present -> present.getName().equals(name)).findAny().orElse(null);
    }

    public String report() {
        StringBuilder output = new StringBuilder();
        output.append(String.format("%s bag contains:%n", getColor()));
        data.forEach(present -> output.append(String.format("%s%n", present)));
        return output.toString();
    }

}
