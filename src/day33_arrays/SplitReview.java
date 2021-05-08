package day33_arrays;

import java.util.*;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] array = word.split("a");
        System.out.println(array.length);
        int countOfA = array.length - 1;
        if(word.endsWith("a")) {
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);

        String[] strArr = word.split("");
        System.out.println(strArr[0]);

        String word1 = "java1ht4ml2sql";
        String[] strArray = word1.split("\\d");
        System.out.println(Arrays.toString(strArray));
    }
}
