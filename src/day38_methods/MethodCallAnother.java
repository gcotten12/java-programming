package day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        start();
        continues();
        end();
    }
    public static void start() {
        System.out.println("start"); // 1st
        continues(); // 2nd
    }
    public static void continues() {
        System.out.println("continue"); // 3rd
        end(); // 4th
    }
    public static void end() {
        System.out.println("end"); // 5th
    }
}
