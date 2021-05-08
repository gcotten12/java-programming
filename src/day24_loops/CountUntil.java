package day24_loops;

import java.util.*;

public class CountUntil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = s.nextInt();
        int count = 1;
        while(count <= number) {
            System.out.print(count + ", ");
            count++;
        }
        System.out.println("\nCount Complete");
    }
}
