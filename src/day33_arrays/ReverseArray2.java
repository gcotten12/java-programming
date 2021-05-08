package day33_arrays;

import java.util.*;

public class ReverseArray2 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        // swap those using additional variable
        int temp = num1;
        num1 = num2;
        num2= temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int[] nums = {5, 10, 4, 100};
        System.out.println("before swap: " + Arrays.toString(nums));

        temp = nums[0]; // temp = 5
        nums[0] = nums[3]; // nums[0] = 100
        nums[3] = temp; // nums[3] = 5

        System.out.println("after swap: " + Arrays.toString(nums));

                    // 0, 1,  2, 3
        int[] nums2 = {5, 10, 4, 100};

        System.out.println("Before: " + Arrays.toString(nums2));

        for(int i = 0; i < nums2.length/2; i++) {
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i] = temp2; // this lines purpose is to put the array back in order

        }
        System.out.println("After: " + Arrays.toString(nums2));


        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("before reverse words = " + Arrays.toString(words));

        for(int i = 0, j = words.length-1; i < words.length/2; i++, j--) {
            String tempWord = words[i]; // you store i into temp so you can move the value to the back of the array
            words[i] = words[j]; // you are moving the value of j to the location of i
            words[j] = tempWord;
        }
        System.out.println("after reverse words = " + Arrays.toString(words)); // this is just a means of rearranging the array
    }
}
