package day42_arraylist;

import java.util.*;

public class MethodWithList {

    public static void main(String[] args) {


        printStrList(Arrays.asList("java", "apple", "coffee", "tea"));

        System.out.println();

        System.out.println(sumIntegerList(Arrays.asList(1, 2, 3, 4)));

    }
    public static void printStrList(List<String> list) {
        for(String each : list) {
            System.out.print(each + " ");

        }
    }

    public static int sumIntegerList(List<Integer> Nums) {
        int sum = 0;
        for(int each : Nums) {
            sum += each;
        }
        return sum;
    }
}
