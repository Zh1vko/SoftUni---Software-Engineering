package _08_CustomListSorter;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomList<T> {
    public List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void addElement (T element) {
        list.add(element);
    }

    public void removeElement (int index) {
        if (!list.isEmpty()) {
            if (list.size() > index) {
                list.remove(index);
            }
        }
    }

    public boolean containsElement (T element) {

        if (list.contains(element)) {
            return true;
        }
        return false;
    }

    public void swapElements(int firstIndex, int secondIndex) {

        if (!list.isEmpty()) {
            if (list.size() > firstIndex && list.size() > secondIndex) {

                T firstTemp = list.get(firstIndex);
                T secondTemp = list.get(secondIndex);

                list.set(firstIndex, secondTemp);
                list.set(secondIndex, firstTemp);
            }
        }
    }


    public <T extends Comparable<T>> int greaterElementsCount (T element) {
        int count = 0;

        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                T currentElement = (T) list.get(i);
                if (currentElement.compareTo(element) > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public <T extends Comparable<T>> T minElement() {

        if (list.size() > 0) {
            T minElement = (T) list.get(0);

            for (int i = 0; i < list.size(); i++) {
                T currentElement = (T) list.get(i);
                if (currentElement.compareTo(minElement) < 0) {
                    minElement = currentElement;
                }
            }
            return minElement;
        }

        throw new EmptyStackException();
    }

    public <T extends Comparable<T>> T maxElement() {

        if (list.size() > 0) {
            T maxElement = (T) list.get(0);

            for (int i = 0; i < list.size(); i++) {
                T currentElement = (T) list.get(i);
                if (currentElement.compareTo(maxElement) > 0) {
                    maxElement = currentElement;
                }
            }
            return maxElement;
        }
        throw new EmptyStackException();
    }

    public <T extends Iterable<T>> void printElements() {
            list.forEach(System.out::println);
        }


    public <T extends Iterable<T>> void sortElements() {
        list.sort(null);
    }
}
