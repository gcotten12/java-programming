package day09_scanner_practice;

import java.util.Scanner;

public class Fahrenheit2Celsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the temperature outside in celsius?");
        System.out.print("If its ");
        int fahrenheit = scan.nextInt();
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Than its " + celsius + " celsius outside.");
    }
}
