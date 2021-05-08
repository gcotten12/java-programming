package day04_variables_intro;

public class VariablePractice {
    public static void main(String[] args){
        int students;
        students = 50;
        System.out.println(students);
        students = 70;
        // the variable student has already been assigned 50
        System.out.println(students);
        // the variable 50 has been replaced by 70 now
        int states;
        states = 10;
        System.out.print("Number of states: ");
        System.out.println(states);

        int apples = 15, bananas = 12;
        System.out.print("Tom has ");
        System.out.println(apples);
        System.out.print("and Jane has ");
        System.out.println(bananas);
        apples = 12;
        bananas = 15;
        System.out.print("Now Tom has ");
        System.out.println(apples);
        System.out.print("and Jane has ");
        System.out.println(bananas);
        long a = 3_000L;
        double b = (float) a;
        System.out.println(b);




    }
}
