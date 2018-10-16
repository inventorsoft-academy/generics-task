package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*

1) Create class-container for any types;
        2) Create class-container for numbers;
        3) Create utility method, which counts even numbers in given collection;
        4) Create utility method, which takes two lists and index and replaces element at given position in the first collection with corresponding element from the second one, without possibility to do vice versa;
        5) Create utility method, which takes two lists and index and switches elements at given position;
        6) Create utility method, which finds maximum element in the given list.
*/


public class Main {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());

        GenericTest.useAnimals(cats);

        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Cat());

        GenericTest.useAnimals(animals);


        NumberContainer data = new NumberContainer();
        data.setListOfIntegers(new ArrayList<>(Arrays.<Integer>asList(1, 2, 3, 4, 5)));
        data.ShowFoo();
        CountUtils.count(data.getListOfIntegers());


        ListUtils.swapElemWithImmutable(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)), new ArrayList<Integer>(Arrays.asList(11, 22, 33, 44, 55)), 1);
        ListUtils.swapElem(new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500)), new ArrayList<Integer>(Arrays.asList(111, 222, 333, 444, 555)), 2);

    }
}

