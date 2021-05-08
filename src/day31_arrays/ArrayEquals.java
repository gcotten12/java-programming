package day31_arrays;

import java.util.*;

public class ArrayEquals {
    public static void main(String[] args) {
        int[] nums1 = {4, 12, 53};
        int[] nums2 = {4, 12, 53};

        System.out.println(Arrays.equals(nums1, nums2));

        int[] nums3 = {4, 12, 53};
        int[] nums4 = {12, 4, 53};

        System.out.println(Arrays.equals(nums3, nums4));
    }
}
