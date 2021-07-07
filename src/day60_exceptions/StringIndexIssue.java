package day60_exceptions;

public class StringIndexIssue {
    public static void main(String[] args) {
        String word = "Java"; // important to leave our variable outside try catch in case we need to use it again
        System.out.println("word = " + word);
        try {
            System.out.println(word.charAt(10));
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());

        }
        String word2 = "selenium";
        System.out.println("word2 = " + word2);
        System.out.println(word2.substring(0, 5));
        try {
            System.out.println(word2.substring(0, 15));
        } catch(Throwable t) {
            System.out.println("Type of exception = " + t.getClass().getSimpleName());
            System.out.println("Reason = " + t.getMessage());
        }
    }
}
