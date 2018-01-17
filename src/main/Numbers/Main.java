package main.Numbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //test ContainerForNumbers 2 - task
        final ContainerForNumbers<Long> firstValue = new ContainerForNumbers<>();
        firstValue.setNumber(13L);
        final ContainerForNumbers<Double> secondValue = new ContainerForNumbers<>();
        secondValue.setNumber(21D);
        //etc.


        List<Integer> firstList = Arrays.asList(1,2,3,8,4);
        List<Integer> secondList = Arrays.asList(4,5,6);

        //test findMaximum 3 - task
        System.out.println(countsNumber(firstList));


        //test methodForListsReplace 4 - task
        System.out.println(ListsReplace(firstList,secondList,2));

        //test methodForListsSwitch 5 - task
        ListsSwitch(firstList,secondList,1);
        System.out.println(firstList);
        System.out.println(secondList);
        //test findMaximum 6 - task
        System.out.println(findMaximum(firstList));
    }

    //utility method, which counts even numbers in given collection
    private static <T> int countsNumber(List<T> list) {
        int counter = 0;
        for (T listElement: list) {
            counter++;
        }
        return counter;
    }


     /*utility method, which takes two lists and index
     and replaces element at given position in the first
     collection with corresponding element from
     the second one, without possibility to do vice versa*/
    private static <T> List<T> ListsReplace (List<T> firstList,List<T> secondList, int index) {
        firstList.set(index,secondList.get(index));
        return firstList;
    }


    //utility method, which takes two lists and index and switches elements at given position
    private static <T> void ListsSwitch (List<T> firstList,List<T> secondList, int index) {
        T buffer = firstList.get(index);
        firstList.set(index,secondList.get(index));
        secondList.set(index,buffer);
    }




    //utility method, which finds maximum element in the given list
    private static Comparable findMaximum(List list){
        return Collections.max(list);
    }



}
