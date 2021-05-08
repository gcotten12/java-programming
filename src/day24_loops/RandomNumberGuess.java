package day24_loops;

import java.util.*;

public class RandomNumberGuess {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt(100);
        int guess;
        do{
            System.out.println("Enter Number:");
            guess = scan.nextInt();
            if(guess > secretNumber) {
                System.out.println("number is too large");
            }else if(guess < secretNumber) {
                System.out.println("number is too small");
            }
        }while(secretNumber != guess);
        System.out.println("You have found the secret number");
    }
}
