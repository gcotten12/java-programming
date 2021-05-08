package day38_methods;

import static day38_methods.ArrayUtils.*;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5,23,1,543,90};
        printArray(nums);
        printArray(new int[]{12,2,3,45,6,7,34});

        System.out.println();

        System.out.println(sum(nums));

        System.out.println();

        System.out.println(contains(nums, 1));
    }

}
