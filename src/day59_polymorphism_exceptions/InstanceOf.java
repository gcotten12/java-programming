package day59_polymorphism_exceptions;

import day57_abstraction_polmorphism.polymorphism.Animal;
import day57_abstraction_polmorphism.polymorphism.Cat;
import day57_abstraction_polmorphism.polymorphism.Dog;

public class InstanceOf {
    public static void main(String[] args) {
        // instance of operator
        Animal animal = new Cat();
        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Dog);

        System.out.println(animal.getClass());
        System.out.println(animal.getClass().getName());
        System.out.println(animal.getClass().getSimpleName());

    }
}
