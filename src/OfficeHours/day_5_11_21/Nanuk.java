package OfficeHours.day_5_11_21;

import java.util.ArrayList;
import java.util.Arrays;

public class Nanuk {

    public static void main(String[] args) {

        ArrayList<String> hunt = new ArrayList<>(Arrays.asList("2", "3", "4", "5", "nanuk"));
        System.out.println(nanuk(hunt, 1, 10));

    }

    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast) {

        int foodFound = 0;

        for(String each : r) {

            if(each.equals("nanuk")) {
                way_stones--;
            }else {
                foodFound += Integer.parseInt(each);
            }

        }

        return way_stones >= 0 && foodFound >= boast;

    }

}
