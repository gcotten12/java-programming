package day18_conditions_practice_strings_intro;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = scan.nextInt();
         if (num % 3 == 0 && num % 5 == 0) {
             System.out.println("FizzBuzz");
         }else if (num % 3 == 0) {
             System.out.println("Fizz");
         }else if (num % 5 == 0) {
             System.out.println("Buzz");
        }else {
             System.out.println("Not divisible by 3 or 5");
         }
    }
}
