package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table");
        int a = 1;

        if(a < 1 || a > 10) {
            System.out.println("Not Valid Number");
            return;
        }

        for(int b = 1; b <= 10; b++) {
            int result = a * b;
            System.out.println("" + a + " x " + b + " = " + result);
        }
    }
}
