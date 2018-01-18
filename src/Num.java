//class-container for numbers

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Num <T extends Number> {

    private List<T> collectin;

    public Num(List<T> collectin) {
        this.collectin = collectin;
    }

    public List<T> getCollectin() {
        return collectin;
    }

    //utility method, which counts even numbers in given collection;
    public String evenNumber(List<T> coll) {
        double even = 0;
        int cout = 0;
        for (T c : coll) {
            even = Double.valueOf(c.toString());
            if (even % 2 == 0) {
                cout++;
            }
        }
        return "In the List we have " + cout + " numbers";

    }

    //method which takes two lists and index and replaces element
    // at given position in the first collection with corresponding
    // element from the second one, without possibility to do vice versa

    public void replaceList(List<? super T> list1, List<? extends T> list2, int index){
        list1.set(index, list2.get(index));
    }

    // utility method, which takes two lists and index and switches elements at given position;
    public void switchList(List<T> list1, List<T> list2, int index){
        T tmp = list1.get(index);
        list1.set(index, list2.get(index));
        list2.set(index, tmp);
    }

    //utility method, which finds maximum element in the given list.
    public <T extends Comparable<? super T>> T maximumElement(Collection<T> list){
        return Collections.max(list);
    }
}

