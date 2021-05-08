package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What hourly rate are you seeking?");
        int hourlyRate = scan.nextInt();
        int weeklyPay = hourlyRate * 40;
        int monthlyPay = weeklyPay * 52/12;
        int annualPay = monthlyPay * 12;
        System.out.println("Your weekly pay will be: " + weeklyPay);
        System.out.println("Your monthly pay will be: " + monthlyPay);
        System.out.println("Your annual pay will be: " + annualPay);

    }
}
