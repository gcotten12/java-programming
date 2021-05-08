package day32_arrays_split;

import java.util.*;

public class MxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println(Arrays.toString(items));


        double maxPrice = 0;
        int indexOfMaxPrice = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }

        System.out.println("Most expensive item = " + items[indexOfMaxPrice] + " - $" + prices[indexOfMaxPrice] + " - " + itemIDs[indexOfMaxPrice]);


        double minPrice = prices[1];
        int indexOfMinPrice = 0;

        for(int j = 0; j < prices.length; j++) {
            if(prices[j] < minPrice) {
                minPrice = prices[j];
                indexOfMinPrice = j;
            }
        }

        System.out.println("Least expensive item = " + items[indexOfMinPrice] + " - $" + prices[indexOfMinPrice] + " - " + itemIDs[indexOfMinPrice]);


    }
}
