package test;

import java.util.List;

public class GenericTest {

    public static void useAnimals(List<? extends Animal> animals) {
        animals.forEach(Animal::echo);
    }
}
class Species {}
class Animal extends Species {
    public void echo() {
        System.out.println("Raw!");
    }
}
class Cat extends Animal {
    @Override
    public void echo() {
        System.out.println("Meow!");
    }
}