import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Utilites {

    /*
     * Task:
     * Create utility method, which counts even numbers in given collection;
    */
    public static <T extends Number, E extends Collection<T>> int countEvenNumbers(E collection) {
        int count = 0;
        for (T val : collection) {
            if (val.intValue() % 2 == 0)
                count ++;
        }
        return count;
    }

    /*
     * Task:
     * Create utility method, which takes two lists and index and replaces element at given
     * position in the first collection with corresponding element from the second one,
     * without possibility to do vice versa;
    */
    public static <T> void replaceFirstInFirstList(List<? super T> list1, List<T> list2, int index) {
        list1.set(index, list2.get(index));
    }

    /*
     * Task:
     * Create utility method, which takes two lists and index and switches elements at given position;
    */
    public static <T> void switchElements(List<T> list1, List<T> list2, int index) {
        T temp = list1.get(index);
        list1.set(index, list2.get(index));
        list2.set(index, temp);
    }

    /*
     * Task:
     * Create utility method, which finds maximum element in the given list.
    */
    public static <T extends Comparable<T>> T findMax(List<T> list) {
        return Collections.max(list);
    }
}