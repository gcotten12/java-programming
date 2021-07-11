package day61_exception_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int minutes = 70;
        System.out.println("Class is going on for " + minutes + " minutes");
        if(minutes > 50) {
            throw new BreakTimeException("It is break time!");
        }
        System.out.println("Let's continue the class");
    }
}
