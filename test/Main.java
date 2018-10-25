package test;

import java.util.*;
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


//1
        AnyTypeContainer container = new AnyTypeContainer(new ArrayList<>(Arrays.asList(1, 0.5, 300, 16.7f, 500l)));
        container.showFooContainer();
        System.out.println(container.getElemByIndex(0));
//2
        SingleNumberContainer<Double> doubleNumber = new SingleNumberContainer<>(0.7);
        doubleNumber.showFoo();

//3
        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
        CountUtils.countEvenFooElements(listOfIntegers);
//4
        /*ListUtils.swapElemWithImmutable(new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50)), new ArrayList<Integer>(Arrays.asList(11, 22, 33, 44, 55)), 1);
        ListUtils.swapElem(new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500)), new ArrayList<Integer>(Arrays.asList(111, 222, 333, 444, 555)), 2);

        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(Collections.max(listOfIntegers));*/

        List<Integer> list1 = new ArrayList<>(Arrays.asList(100, 30, 50, 20, 70));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(25, 75, 92, 185, 35));

        ListUtils.replaceFooUnmod(list1, list2, 3);
        System.out.println(list1);
//5
        List<Integer> list11 = new ArrayList<>(Arrays.asList(1100, 330, 550, 220, 770));
        List<Integer> list22 = new ArrayList<>(Arrays.asList(225, 775, 992, 1185, 335));

        ListUtils.switchFooElems(list11, list22, 3);

        System.out.println(list1);
        System.out.println(list2);

//6
        Comparator<Integer> comp = new Comparator<Integer>() {
            public int compare(Integer d1, Integer d2) {
                return d1.compareTo(d2);
            }
        };

        List<Integer> list = new ArrayList<>(Arrays.asList(30, 75, 92, 185, 15));
        int max = MaxUtils.findMaxFoo(list, comp);

        System.out.println("Max value = " + max);

//Getting max elem by field
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("John", 30, 2000));
        workers.add(new Worker("Bruce", 31, 3000));
        workers.add(new Worker("Lee", 32, 4000));

        Worker w = workers.stream()
                .max((w1, w2) -> Integer.compare(w1.getAge(), w2.getAge()))
                .get();
        w.showFoo();

        workers.stream()
                .reduce((w1, w2) -> w1.getSalary() > w2.getSalary() ? w1 : w2)
                .ifPresent(System.out::println);


    }
}

