package interview_prep;

import java.util.Arrays;
import java.util.List;

public class CodingBatFrontBack {
    public static void main(String[] args) {
        System.out.println("frontBack(\"hello\") = " + frontBack("hello"));
    }

    public static String frontBack(String str) {
        char[] charArr = str.toCharArray();
        char firstLetter = str.charAt(0);
        charArr[0] = charArr[charArr.length-1];
        charArr[charArr.length-1] = firstLetter;
        String newStr = "";
        for (char each : charArr) {
            newStr += each;
        }
        return newStr;
    }

}


