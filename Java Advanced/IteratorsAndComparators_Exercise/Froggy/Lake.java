package Froggy;

import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Lake implements Iterable<Integer> {

    private List<Integer> lake;

    public Lake(Integer... elements) {
        this.lake = List.of(elements);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Froggy();
    }


    private class Froggy implements Iterator<Integer> {
            private int index = 0;
            private boolean firstHalfFinished = false;

        @Override
        public boolean hasNext() {
            return index < lake.size() -1;
        }

        @Override
        public Integer next() {
            Integer element = lake.get(index);
            index += 2;
            if (index >= lake.size() && !firstHalfFinished) {
                index = 1;
                firstHalfFinished = true;
            }
            return element;
        }
    }

}
