package day55_abstraction_interface.exercise_example;

public class FreeWeight extends Lifting {

    @Override
    public void perform() {
        System.out.println("Doing barbell row");
    }

    @Override
    public int getCaloriesCount(int min) {
        return min * 6;
    }

    @Override
    public void endLift() {
        System.out.println("Carefully re-rack the weight");
    }



}
