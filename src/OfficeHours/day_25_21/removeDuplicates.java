package OfficeHours.day_25_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,3,5,1,9,2));
        System.out.println(removeDup(list));
        System.out.println(removeDup2(list));

    }

    public static ArrayList<Integer> removeDup(ArrayList<Integer> list) {

        ArrayList<Integer> unique = new ArrayList<>();
        String checked = "";

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            if(!checked.contains("" + list.get(i))) {

            for (int j = 0; j < list.size(); j++) {

                if (list.get(i) == list.get(j)) {
                    count++;
                }

            }

                if (count == 1) {
                    unique.add(list.get(i));
                }

            checked += list.get(i) + " ";

            }

        }

        return unique;

    }

    public static ArrayList<Integer> removeDup2(ArrayList<Integer> list) {
        // this is a lamda expression that will remove if our element is repeated in our list
        list.removeIf(e -> Collections.frequency(list, e) > 1);
            return list;

    }

}
