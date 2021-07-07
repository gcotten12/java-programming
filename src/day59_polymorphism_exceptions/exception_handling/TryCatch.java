package day59_polymorphism_exceptions.exception_handling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
            System.out.println(10 / 0);
            System.out.println(10 / 3);
        } catch(Exception e) {
            System.out.println("RunTimeException happened and handled");
        }
        System.out.println("After first try catch");
    }
}
