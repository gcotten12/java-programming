package day49_static;

public class StaticTest {
    String word = "java";
    static String words = "Java";
    public static void main(String[] args) {

        StaticMethods.displayMessage("Wooden Spoon"); // we can call this method because it is static
        // StaticMethods.instanceMethod(); ERROR -> instanceMethod() is void so we need to create an object to call it
        StaticMethods stm = new StaticMethods();
        stm.instanceMethod(); // instance method needs an object in order to be called

        // static methods can only access other static methods and variables
        // System.out.println(word); ERROR -> cannot be accessed because word is not static
        System.out.println("words = " + words);
    }
}
