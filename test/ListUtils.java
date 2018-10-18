package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ListUtils {

    private ListUtils() {
    }

    public static <T> void swapElemWithImmutable(List<T> source, List<T> origin, int index) {

        List<T> unmodList = Collections.unmodifiableList(source);

        origin.set(index, unmodList.get(index));

        for(T list : origin ) {
            System.out.println(list);
        }

    }

    public static <T> void swapElem(List<T> source, List<T> origin, int index) {

        origin.set(index, source.get(index));
        for(T list : origin ) {
            System.out.println(list);
        }
    }
}