package day09_scanner_practice;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yesterday I went to the store and bought milk for ");
        double price1 = scan.nextDouble();
        System.out.println(", bread for ");
        double price2 = scan.nextDouble();
        System.out.println(" and a cucumber for ");
        double price3 = scan.nextDouble();
        double total = price1 + price2 + price3;
        System.out.println("I spent $" + total + " at the store yesterday. ");
    }
}
