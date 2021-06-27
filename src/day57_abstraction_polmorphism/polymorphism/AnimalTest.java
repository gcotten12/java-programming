package day57_abstraction_polmorphism.polymorphism;

public class AnimalTest {

    public static void main(String[] args) {

        Animal a1 = new Animal(); // NOT POLYMORPHISM
        a1.makeNoise();

        Animal animal1 = new Dog();
        animal1.makeNoise();
        Animal animal2 = new Horse();
        animal2.makeNoise();
        Animal animal3 = new Cat();
        animal3.makeNoise();

    }

}
