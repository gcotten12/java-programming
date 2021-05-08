package ReplitCode;
import java.util.*;

public class SecondsConverter {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int inputSeconds = scan.nextInt();
        int hours = inputSeconds/3600;
        int remainingSecondsAfterHours = inputSeconds%3600;
        int minutes = remainingSecondsAfterHours/60;
        int seconds = remainingSecondsAfterHours%60;
        System.out.println(hours+" hours, "+minutes+" minutes, and "+seconds+" seconds");


    }
}
