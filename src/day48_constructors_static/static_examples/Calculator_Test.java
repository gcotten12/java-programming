package day48_constructors_static.static_examples;

public class Calculator_Test {

    public static void main(String[] args) {

        // add is a static method so we can call it by using the className.staticMethodName
        Calculator.add(2,3);
        // multiply is an instance method so we have to create a new object in order to call it
        Calculator cal = new Calculator();
        cal.multiply(2,3);
        // static method can also be called using an object
        cal.add(2,3);

    }

}
