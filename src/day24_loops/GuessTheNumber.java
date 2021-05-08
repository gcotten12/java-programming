package day24_loops;

import java.util.*;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int secretNumber = 42;
        int guess;
        do{
            System.out.println("Guess the number");
            guess = s.nextInt();
            if(guess > secretNumber) {
                System.out.println("number is too large");
            }else if(guess < secretNumber) {
                System.out.println("number is too small");
            }
            System.out.println();
        }while(secretNumber != guess);
        System.out.println("You have successfully guessed the secret number!");
    }
}
