package day11_comparison_operators;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 = 10, num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int num3 = 10, num4 = num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println(++num4);
        System.out.println(num4);

        int a = 50;
        int b = 22;
        int c = a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);



    }
}
