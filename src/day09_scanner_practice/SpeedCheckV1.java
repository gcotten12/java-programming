package day09_scanner_practice;

import java.util.Scanner;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is speed limit for this road?");
        int speedLimit = scan.nextInt();
        int currentSpeed = 75;
        int overTheLimit = currentSpeed - speedLimit;
        System.out.println("You are driving " + overTheLimit + "mph over the speed limit. You should slow down!");
    }
}
