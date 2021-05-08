package ReplitCode;

import java.util.Scanner;

public class firstAndLast {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        char firstLetter = word.charAt(0);
        int count = word.length();
        char lastLetter = word.charAt(count-1);
        System.out.println("" + firstLetter + lastLetter);
    }
}
