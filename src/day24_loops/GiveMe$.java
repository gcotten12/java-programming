package day24_loops;

import java.util.*;

public class GiveMe$ {
    public static void main(String[] args) {
        System.out.println("Give me 5 dollars");
        Scanner s = new Scanner(System.in);
        int dollars = s.nextInt();
        while(dollars != 5) {
            System.out.println("Give me 5 dollars");
            dollars += s.nextInt();
        }
        System.out.println("Thank you for $5");
    }
}
