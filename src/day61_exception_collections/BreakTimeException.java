package day61_exception_collections;

public class BreakTimeException extends RuntimeException {

    public BreakTimeException(String message) {
        super(message); // call to parent class constructor so our message will appear in the console when the test fails
    }

    public BreakTimeException() {}

}
