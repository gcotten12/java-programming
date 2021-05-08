package OfficeHours.day_4_6_21;

import java.util.*;

public class RandomSixDigitNumber {
    public static void main(String[] args) {
        Random random = new Random();

        String randomNumber = "";

        while (randomNumber.length() != 6) {

            int eachRandom = random.nextInt(9) + 1; // 1-9

            if(!randomNumber.contains(""+ eachRandom)) {
                randomNumber += eachRandom;
            }
        }

        System.out.println("Random Number: " + randomNumber);

    }
}
