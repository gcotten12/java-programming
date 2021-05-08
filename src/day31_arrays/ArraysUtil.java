package day31_arrays;

import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5, 1, 7, 0, -4, 44, 33};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Min: "+ nums[0]);
        System.out.println("Max: "+ nums[nums.length-1]);

        String[] words = {"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println(String.join(", ", words));

        // sort words in alphabetic and ASCII order
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        Arrays.sort(words,Collections.reverseOrder());
        System.out.println(Arrays.toString(words));
    }
}
