package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("Even Numbers 1-100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nEven Numbers 1-100: ");
        for(int k = 1; k <= 100; k++) {
            if(k % 2 != 0) {
                System.out.print(k + " ");
            }
        }
    }
}
