package day09_scanner_practice;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Cents: ");
        int cents = scan.nextInt();

        int dollars = cents/100;
        System.out.println("dollars = " + dollars);

        int remainingCents = cents % 100;
        System.out.println("remaining cents = " + remainingCents);

        System.out.println("There is " +cents+ " cents so I have " +dollars+ " dollars and " +remainingCents+ " cents.");




    }
}
