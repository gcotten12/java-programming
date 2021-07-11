package day61_exception_collections;

import java.util.Scanner;

public class InsufficientBalanceTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double balance = 400;
        double itemPrice = scan.nextDouble();

        if (itemPrice > balance) {
            throw new InsufficientBalanceException("\nTransaction Declined!\nNot enough funds!");
        } else {
            System.out.println("Item successfully purchased");
        }
    }
}
