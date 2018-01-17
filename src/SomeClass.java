import java.util.Arrays;
import java.util.List;

public class SomeClass {

    public static <T extends Number> void evenNumberCount(List<T> numbers){
        int evenNumbers = 0;
        for (T num : numbers) {
            if (num instanceof Integer && num.intValue() % 2 == 0){
                evenNumbers++;
            }
        }
    }

    public static <T> void replaceElement(List<? super T> firstList, List<? extends T> secondList, int index){

        firstList.set(index, secondList.get(index));
    }

    public static <T> void switchElements(List<T> firstList, List<T> secondList, int index){

        T temp = firstList.get(index);
        firstList.set(index, secondList.get(index));
        secondList.set(index, temp);
    }

    public static <T extends Comparable<T>>void findMax(List<T> list){

        T max = list.get(0);
        for (T element : list) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
    }

    public static void main(String[] args) {

        List<Number> a = Arrays.asList(1,2,1,2,5);
        List<Integer> b = Arrays.asList(10,9,8,97,6);

        SomeClass.replaceElement(a,b,2);
    }
}
