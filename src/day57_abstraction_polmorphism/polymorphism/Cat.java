package day57_abstraction_polmorphism.polymorphism;

public class Cat extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Cat is meowing");
    }

}
