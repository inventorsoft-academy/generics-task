import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args){
        List<Integer> firstList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> secondList = Arrays.asList(11, 12, 13, 14, 15, 16, 17,18);

        countingEvenNumber(secondList);
        replaceElementInFirstList(firstList, secondList, 3);
        replaceElements(firstList, secondList, 0);
        findMax(secondList);
    }
    //utility method, which counts even numbers in given collection
    public static <T extends Number> void countingEvenNumber(List<T> list){
        int count = 0;
        System.out.print("Even numbers - ");
        for(T t : list){
            if(t.intValue() % 2 == 0){
                count = count + t.intValue();
                System.out.print(t +" ");
            }
        }
        System.out.println("Summ of even numbers = " + count);
    }
    //utility method, which takes two lists and index and replaces element at given position in the first collection
    // with corresponding element from the second one, without possibility to do vice versa;
    public static <T> void replaceElementInFirstList(List<? super T> list1, List<? extends T>list2, int index){
        T temp;
        temp = list2.get(index);
        list1.set(index, temp);
    }
    //Create utility method, which takes two lists and index and switches elements at given position;
    public static <T> void replaceElements(List<T> list1, List<T> list2, int index  ){
        T tempList1 = list1.get(index);
        T tempList2 = list2.get(index);
        list1.set(index, tempList2);
        list2.set(index, tempList1);
    }
    //utility method, which finds maximum element in the given list
    public static <T extends Comparable> void findMax(List<T> list){
        T max = list.get(0);
        for(T t : list){
            if(t.compareTo(max) > 0){
                max = t;
            }
        }
        System.out.println(max);
    }

}
