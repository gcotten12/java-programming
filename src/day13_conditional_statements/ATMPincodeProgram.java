package day13_conditional_statements;

import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***Welcome to Chase Bank!***\nInput Pincode to Access an Account:");
        short inputPincode = scan.nextShort();
        short secretPincode = 1234;
        if(inputPincode==secretPincode) {
            System.out.println("Welcome to your account!");
            System.out.println("Please choose an option below:\nWithdraw\nCheck Balance\nDeposit");
        }else {
            System.out.println("Incorrect Pincode!\nPlease Try Again");
        }
        System.out.println();
        System.out.println("Thank you for using Chase Bank ATM!");
    }
}
