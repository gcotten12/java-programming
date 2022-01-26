package interview_prep;

import java.util.Arrays;

public class SameLetters {

        /*
        Ex:  same("abc",  "cab"); -> true
            same("abc",  "abb"); -> false:
         */

    public static boolean SameLetters(String str1, String str2) {

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String newStr1 = "";
        String newStr2 = "";

        for(char each : ch1) {
            newStr1+=each;
        }
        for(char each : ch1) {
            newStr2+=each;
        }

        return newStr1.equals(newStr2);


    }

    public static void main(String[] args) {

        System.out.println(SameLetters("abc", "cab"));

    }



}
