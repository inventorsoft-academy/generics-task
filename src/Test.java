import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        Num<Integer> num = new Num<Integer>(list);
        System.out.println(num.evenNumber(list));

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(-1);
        list2.add(-2);
        list2.add(-3);

        //replaces element
        num.replaceList(list1,list2,0);
        System.out.println(list1);

        //switches elemet
        num.switchList(list1,list2,1);
        System.out.println(list1+"\n"+list2);

        //maximum element
        System.out.println(num.maximumElement(list1));

        class Person implements Comparable {

            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        new Num<>(Collections.emptyList()).maximumElement(Arrays.asList(new Person(), new Person()));

    }
}
