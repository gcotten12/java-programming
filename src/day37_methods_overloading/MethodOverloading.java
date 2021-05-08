package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(2,4));
        System.out.println(sum(2.2,4.6));
        System.out.println(sum(2,4,3));
        System.out.println(sum("2","4"));

    }
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
    public static int sum(int num1, int num2, int num3) {
        return num1 + num2;
    }
    public static String sum(String num1, String num2) {
        return num1 + num2;
    }
}
