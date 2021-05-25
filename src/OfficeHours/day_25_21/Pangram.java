package OfficeHours.day_25_21;

import java.util.Locale;

public class Pangram {

    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog.";
        System.out.println(isPangram(s));

    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        String alp = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {

            if(Character.isLetter(str.charAt(i))) {
                alp = alp.replace("" + str.charAt(i), "");
                System.out.println(str.charAt(i) + " " + alp);
            }

        }
        return alp.isEmpty();
    }

}
