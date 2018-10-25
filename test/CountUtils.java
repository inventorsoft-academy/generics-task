package test;

import java.util.List;

public class CountUtils {

    public static <T extends Number> void countEvenFooElements(List<T> collection) {

        int tempCounter = 0;

        for (Number n : collection) {

            if (n.intValue() % 2 == 0) {
                tempCounter++;
            }
        }
        System.out.println(tempCounter);
    }


}








