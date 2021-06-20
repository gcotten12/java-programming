package day55_abstraction_interface.exercise_example;

public abstract class Exercise {

    public void start() {
        System.out.println("Warming up and starting the exercise");
    }

    // creating abstract methods allows the sub classes to override and create their own implementations

    public abstract void perform(); // we do not need curly braces when we create an abstract method

    public abstract int getCaloriesCount(int min);


}
