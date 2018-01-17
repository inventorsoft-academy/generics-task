package main;

import java.util.Collections;
import java.util.List;

public class Numbers<T extends Number> {
    private List<T> numbersList;

    public Numbers(List<T> numbersList) {
        this.numbersList = numbersList;
    }

    public int countEvenNumbers() {
        int counter = 0;
        for (T number : numbersList) {
            if (Math.abs(number.intValue()) % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * This method sets list 1's element with an index corresponding to index parameter
     * to a value of an element of list 2 with the same index preventing the reverse operation.
     * */
    public void setValue(List<T> list1, final List<T> list2, int index) {
        list1.set(index, list2.get(index));
    }

    public void swapValues(List<T> list1, List<T> list2, int index) {
        T value = list1.get(index);
        list1.set(index, list2.get(index));
        list2.set(index, value);
    }

    public Comparable getMaximumValue(List list) {
        return Collections.max(list);
    }
}
