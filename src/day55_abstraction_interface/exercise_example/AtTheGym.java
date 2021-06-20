package day55_abstraction_interface.exercise_example;

public class AtTheGym {

    public static void main(String[] args) {

        Exercise exercise = new Running(); // Polymorphism
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeweight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running for 30 minutes would burn = " + exercise.getCaloriesCount(30) + " calories");

        running.start();
        running.perform();
        System.out.println(running.getCaloriesCount(25));

        swimming.start();
        swimming.perform();
        System.out.println(swimming.getCaloriesCount(45));

        freeweight.start();
        freeweight.perform();
        System.out.println(freeweight.getCaloriesCount(90));

    }

}
