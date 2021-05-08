package day10_shorthand_operator;

import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Values:");
        int rent = scan.nextInt();
        scan.nextLine();//fix the bug. WORKAROUND
        String month = scan.nextLine();
        System.out.println(rent);
        System.out.println(month);

    }
}
