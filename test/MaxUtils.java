package test;

import java.util.Comparator;
import java.util.List;

public class MaxUtils {

    public static <T> T findMaxFoo(List<T> list, Comparator<? super T> comp) {

        T max = list.get(0);

        for (int i = 1; i < list.size(); i++) {

            T elem = list.get(i);

            if (comp.compare(elem, max) > 0) {
                max = elem;
            }
        }

        return max;
    }
}
