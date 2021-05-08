package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithListReturn {

    public static void main(String[] args) {
//        long start = System.nanoTime();
//
//        List<Integer> numList = getIntegerList();
//        System.out.println(numList);
//
//        long end = System.nanoTime();
//        System.out.println("ArrayList time = " + (end - start));
//
//
//
//        long st = System.nanoTime();
//
//        int[] intArr = getIntegerArray();
//        System.out.println(Arrays.toString(intArr));
//
//        long nd = System.nanoTime();
//        System.out.println("Array time = " + (st - nd));

    }

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for(int i = 0; i <= 100_000; i++) {
            nums.add(i);
        }
        return nums;
    }

    public static int[] getIntegerArray() {
        int[] nums = new int[100_001];
        for(int i = 0; i <= 100_000; i++) {
            nums[i] = i;
        }
        return nums;
    }


}
