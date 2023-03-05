package kindergarten;

import java.util.*;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child) {
        if (registry.size() < capacity) {
            this.registry.add(child);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeChild(String firstName) {
        for (int i = 0; i < registry.size(); i++) {
            Child child = registry.get(i);
            if (child.getFirstName().equals(firstName)) {
                registry.remove(i);
                return true;
            }
        }
        return false;
    }

    public int getChildrenCount() {
        return this.registry.size();
    }

    public Child getChild(String firstName) {
        Child childNeeded = null;
        for (Child child : registry) {
            if (child.getFirstName().equals(firstName)) {
                childNeeded = child;
            }
        }
        if (childNeeded != null) {
            return childNeeded;
        } else {
            throw new IllegalStateException("No such child");
        }
    }

    /**
     * age ascending, then by first name ascending , then by last name ascending, ,
     * and
     * returns a String in the following format.
     */

    public String registryReport() {
        ArrayList<Child> sortedRegistry = new ArrayList<Child>(registry);
        sortedRegistry.sort(new Comparator<Child>() {

            @Override
            public int compare(Child c1, Child c2) {
                int ageComparison = Integer.compare(c1.getAge(), c2.getAge());
                if (ageComparison != 0) {
                    return ageComparison;
                }
                int firstNameComparison = c1.getFirstName().compareTo(c2.getFirstName());
                if (firstNameComparison != 0) {
                    return firstNameComparison;
                }
                return c1.getLastName().compareTo(c2.getLastName());
            }

        });

        String returnString = "Registered children in " + name + ":\n";
        for (int i = 0; i < sortedRegistry.size(); i++) {
            returnString += "--\n";

            if (i == sortedRegistry.size() - 1) {
                returnString += sortedRegistry.get(i).toString();
            } else {
                returnString += sortedRegistry.get(i).toString() + "\n";
            }
        }
        return returnString;
    }
}
