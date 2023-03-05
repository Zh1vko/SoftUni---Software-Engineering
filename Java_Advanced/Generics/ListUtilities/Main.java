package ListUtilities;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>();
        ints.add(0);
        ints.add(2);
        ints.add(4);
        ints.add(7);

        System.out.println(ListUtils.getMin(ints));
        System.out.println(ListUtils.getMax(ints));
    }


}
