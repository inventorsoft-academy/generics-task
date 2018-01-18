package generics;


import java.util.*;

/**
 * Created by Komatoz on 17.01.2018.
 */
public class Starter {


    public static void main(String[] args) {

    }

    public static <T> int countEven(List<? extends Number> list){
        int result = 0;
        for (Number num : list) {
            if (Math.IEEEremainder(Double.valueOf(num.toString()), 2) == 0) result++;
        }
        return result;
    }

    public static <T> void swapListElement(List<? super T > list1, List<T> list2, int i){
        list1.set(i, list2.get(i));


    }

    public static <T> void switchListElement(List<T> list1, List<T> list2, int i ){
        T temp = list1.get(i);
        list1.set(i, list2.get(i));
        list2.set(i, temp);
    }

    public static  Comparable maxElement(List<? extends Comparable>  list){
        return Collections.max(list);
    }

}
