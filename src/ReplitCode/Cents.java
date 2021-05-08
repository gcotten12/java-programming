package ReplitCode;

import java.util.*;

public class Cents {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter cents:");
        int totalCents = s.nextInt();
        int quarters = totalCents/25;
        int remainingCents = totalCents%25;
        int dimes = remainingCents/10;
        int centsAfterDimes = remainingCents%10;
        int nickles = centsAfterDimes/5;
        int centsAfterNickles = centsAfterDimes%5;
        int pennies = centsAfterNickles/1;

        System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+nickles+" nickles, and "+pennies+ " pennies");
    }
}
