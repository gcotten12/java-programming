package day12_conditional_statements;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Total Price:");
        double itemPrice = scan.nextDouble();
        if(itemPrice>=25) {
            System.out.println("You are Eligible for Free Shipping\nYour order total is: $"+itemPrice);
        }else {
            System.out.println("You are not Eligible for Free Shipping\nYour order total is: $"+(itemPrice+10));
        }
        System.out.println();
        System.out.println("Thank you for shopping with Amazon!");
    }
}
