package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(4,6));
        System.out.println(subtract(12,45));
        System.out.println(multiply(4,30));
        System.out.println(divide(1234,12));
    }
    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
    public static double subtract(double num1, double num2) {
        double difference = num1 - num2;
        return difference;
    }
    public static double multiply(double num1, double num2) {
        double product = num1 * num2;
        return product;
    }
    public static double divide(double num1, double num2) {
        double quotient = num1 / num2;
        return quotient;
    }
}
