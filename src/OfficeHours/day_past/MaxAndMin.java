package OfficeHours.day_past;

import java.util.*;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        int first = s.nextInt();
        int max = first;
        int min = first;

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number");
            int number = s.nextInt();

            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);
    }
}