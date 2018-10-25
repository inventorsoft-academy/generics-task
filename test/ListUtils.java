package test;

import java.util.Collections;
import java.util.List;

public final class ListUtils {

    private ListUtils() {
    }
//old version
    public static <T> void swapElemWithImmutable(List<T> source, List<T> origin, int index) {

        List<T> unmodList = Collections.unmodifiableList(source);

        origin.set(index, unmodList.get(index));

        for(T list : origin ) {
            System.out.println(list);
        }

    }
//old version
    public static <T> void swapElem(List<T> source, List<T> origin, int index) {

        origin.set(index, source.get(index));
        for(T list : origin ) {
            System.out.println(list);
        }
    }

    public static <T> void replaceFooUnmod(List<T> list1, List<T> list2, int index) {

        list2 = Collections.unmodifiableList(list2);
        list1.set(index, list2.get(index));
    }

    public static <T> void replaceFooUnmodGen(List<? super T> list1, List<? extends T> list2, int index) {

        list2 = Collections.unmodifiableList(list2);
        list1.set(index, list2.get(index));
    }

    public static <T> void switchFooElems(List<T> list1, List<T> list2, int index) {

        T temp = list1.get(index);
        list1.set(index, list2.get(index));
        list2.set(index, temp);
    }

}