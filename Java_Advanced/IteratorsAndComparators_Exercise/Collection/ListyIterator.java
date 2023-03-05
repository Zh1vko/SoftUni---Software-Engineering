package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class ListyIterator implements Iterable {

    private List<String> collection;
    private int index;

    public ListyIterator(String... element) {
        this.collection = List.of(element);
        index = 0;

    }
    public boolean hasNext() {
        return index < collection.size() - 1;
    }

    public boolean move() {
        if (hasNext()) {
            index++;
            return true;
        }
        return false;
    }

    public void printIndex() {
        if (collection.isEmpty()) {
            throw new IllegalStateException("Invalid Operation!");
        } else {
            System.out.println(collection.get(index));
        }

    }



    public Iterator iterator() {
        return collection.iterator();
    }

    public void forEach(Consumer action) {
        Iterable.super.forEach(action);
    }


    public Spliterator spliterator() {
        return Iterable.super.spliterator();
    }
}
