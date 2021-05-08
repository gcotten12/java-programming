package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(10, 20 , 30, 40, 50);
        System.out.println("nums = " + nums);
        // nums.add(100);
        // System.out.println("nums = " + nums); -> will result in ERROR because it is an immutable Array so we cannot change it
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        nums1.add(5);
        System.out.println("nums1 = " + nums1);
        nums1.remove(new Integer(1));
        System.out.println("nums1 = " + nums1);

        // List String drinksWithCaffeine -> coffee, mtn dew, monster, coke, rockstar, bang

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList
                ("coffee", "mtn dew", "monster", "coke", "rockstar", "bang"));

//        drinksWithCaffeine.add("coffee"); drinksWithCaffeine.add("mtn dew"); drinksWithCaffeine.add("monster");
//        drinksWithCaffeine.add("coke"); drinksWithCaffeine.add("rockstar"); drinksWithCaffeine.add("bang");

        int caffeineAmount = 0;

        for(int i = 0; i < drinksWithCaffeine.size(); i++) {
            String drink = drinksWithCaffeine.get(i);
            if(drink.equals("monster") || drink.equals("rockstar") ||
                    drink.equals("bang")) {
                caffeineAmount = 150;
            }else if(drink.equals("coke") || drink.equals("mtn dew") ||
                    drink.equals("coffee")) {
                caffeineAmount = 45;
            }
            System.out.println(drink + " has " + caffeineAmount + "mg of caffeine");
        }

        drinksWithCaffeine.forEach(drink -> System.out.println(drink));

        drinksWithCaffeine.forEach(each -> {
            System.out.println("----------");
            System.out.println("each = " + each);
            System.out.println("----------");
        });


    }



}
