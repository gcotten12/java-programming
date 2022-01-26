package day25_loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
//        for(int stars = 1; stars <= 15; stars++) {
//            System.out.print("*");
//        }
//
//        System.out.println();
//
//        String myStars = "";
//        for(int i = 1; i <=5; i++) {
//            myStars += "* ";
//        }
//        System.out.println("My stars: " + myStars.trim());

//        int i = 1;
//        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }
}
