package day24_loops;

import java.util.*;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode;//must declare here so it is visible for while condition
        do{
            System.out.println("Enter Pin Code:");
            pinCode = s.nextInt();
        }while(pinCode != secretPinCode);
        System.out.println("Welcome to your account");
    }
}
