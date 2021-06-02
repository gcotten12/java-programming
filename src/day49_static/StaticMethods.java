package day49_static;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("message: " + message);
        // System.out.println("num = " + num); ERROR -> num is not static so we can not call it
        System.out.println("count = " + count); // we can use count because it is static
    }

    public void instanceMethod() {
        displayMessage("hello");
        System.out.println("num = " + num);
    }
}
