package day29_nestedloop_arrays;

public class ArraysWithNumbers {
    public static void main(String[] args) {
        int[] nums = new int[2];
        System.out.println(nums[0]);
        System.out.println(nums[1]);

        //declare int array counters and assign 5 values
        int[] counters = {25, 40, 55, 100, 200};

        //declare double array prices and assign 3 prices
        double[] prices = {23.99, 100, 44.33};
        prices[1] = prices[2] * 3;
        System.out.println(prices[3]);

        //declare String array cities and assign 4 city names
        String[] cities = {"Dallas", "Austin", "Houston", "San Antonio"};
    }
}
