import java.util.*;

class Main {
    public static void main (String[] args) {
        List<Object> numbers = new LinkedList<Object>(Arrays.asList(1,2,3,5,4));
        List<Object> numbers_ = new LinkedList<Object>(Arrays.asList(9,6,8,2,4));

        System.out.println("-Test of 'switchElements' method- \n index is 2\n before");
        System.out.println(numbers.toString() + "\n" + numbers_.toString());
        Utilites.switchElements(numbers, numbers_, 2);
        System.out.println(" after");
        System.out.println(numbers.toString() + "\n" + numbers_.toString());


        List<Integer> b = new ArrayList<Integer>(Arrays.asList(1,6,9,4));
        List<Number> a = new ArrayList<Number>(Arrays.asList(1,2,7,4));
        System.out.println("-Test of 'replaceFirstInFirstList' method- \n before");
        System.out.println(a.toString() + "\n" + b.toString());
        Utilites.replaceFirstInFirstList(a, b, 2);
        System.out.println(" after");
        System.out.println(a.toString() + "\n" + b.toString());

        List<Integer> input_list = new LinkedList<Integer>(Arrays.asList(1,2,3,5,4));
        System.out.println("-Test of 'findMax' and 'countEvenNumbers' methods- \ninput:" + input_list.toString());
        System.out.println("Max value is " + Utilites.findMax(input_list));
        System.out.println("Quantity of even numbers is " + Utilites.countEvenNumbers(input_list));
    }
}