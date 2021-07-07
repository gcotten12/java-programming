package day60_exceptions;

import java.util.*;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            System.out.println("You entered " + num);
        } catch(InputMismatchException e) {
            System.out.println("You entered Invalid value");
        } finally {
            scan.close();
            System.out.println("finally block runs always");
        }
    }
}
