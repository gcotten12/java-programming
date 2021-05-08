package day24_loops;

public class WhileLoopsApples {
    public static void main(String[] args) {
        int apples = 1;

        while(apples <= 10) {
            System.out.println("Eat apple " + apples);
            apples++;
        }
        System.out.println("I am out of apples");
    }
}
