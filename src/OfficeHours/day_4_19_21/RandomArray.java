package OfficeHours.day_4_19_21;

import java.util.*;

public class RandomArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getRandomInArray(5, 40)));
        int[] a = getRandomInArray(7, 80);
        System.out.println(Arrays.toString(a));

    }

    public static int[] getRandomInArray(int size, int maxRandomNum) {

        Random random = new Random();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++) {
            arr[i] = random.nextInt(maxRandomNum);
        }

        return arr;
    }

}
