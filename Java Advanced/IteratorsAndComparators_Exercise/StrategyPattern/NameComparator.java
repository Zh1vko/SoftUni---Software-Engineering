package StrategyPattern;

import java.util.Comparator;

public class NameComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {

        if (o1.getName().compareTo(o2.getName()) == 0) {
            return o1.getFirstLetter()-o2.getFirstLetter();
        }

        return o1.getName().length() - o2.getName().length();
    }


}
