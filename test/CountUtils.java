package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static oracle.jrockit.jfr.events.Bits.intValue;

public class CountUtils {

    public static <Integer> void count(List<Integer> data) {

        int num = 0;
        int sum = 0;
       ArrayList<Integer> even = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            if (i % 2 != 0) {
                even.add(data.get(i));
                num = intValue(data.get(i));
                sum = sum + num;
           }

        }
        System.out.println(sum);

    }

    }








