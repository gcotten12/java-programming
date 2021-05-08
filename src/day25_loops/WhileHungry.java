package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        int full = 3;

        while (isHungry) {
            bananas++;
            System.out.println("Eat another banana");
            if (full == bananas) {
                isHungry = false;
            }
        }
        System.out.println("\nI am full");
    }
}

