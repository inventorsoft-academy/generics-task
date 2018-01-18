package main;

import java.util.Arrays;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Container<Object> objectContainer = new Container<>(5, "five");
        Container<Double> doubleContainer = new Container<>(3.1415, "PI");

        List<Integer> list1 = Arrays.asList(1, 3, 7, 10, 15, 26, 28);
        List<Integer> list2 = Arrays.asList(-5, 4, 8, 13, 24, 9, 17);

        List<Double> list3 = Arrays.asList(1.0, 3.0, 7.0, 10.0, 15.0, 26.0, 28.0);

        Numbers<Integer> integerContainer = new Numbers<>(list1);
        Numbers<Double> doubleNumbers = new Numbers<>(list3);
        System.out.println("There are " + integerContainer.countEvenNumbers() + " even numbers");
        System.out.println("There are " + doubleNumbers.countEvenNumbers() + " even numbers in doubles list");

        int res = new Numbers(Arrays.asList(4.1, 4.2, 4.3)).countEvenNumbers();
        System.out.println("Test... Number of even values in 4.1, 4.2, 4.3 is: " + res);

        integerContainer.setValue(list1, list2, 3);
        list1.forEach(System.out::println);
        System.out.println("--- --- ---");

        integerContainer.swapValues(list1, list2, 2);
        list1.forEach(System.out::println);
        System.out.println("--- --- ---");

        System.out.println("List 1 maximum element: " + integerContainer.getMaximumValue(list1));
        System.out.println("List 2 maximum element: " + integerContainer.getMaximumValue(list2));
    }
}
