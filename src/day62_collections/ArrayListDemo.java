package day62_collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        // cannot create object of interface class, which is why we have to create a new ArrayList not new List
        List<String> cities = new ArrayList<>();
        Collection<String> schools = new ArrayList<>();

        cities.add("Mclean");
        cities.add("Vienna");
        cities.add("New York");
        cities.add("New York");

        System.out.println(cities);
        System.out.println("first city : " + cities.get(0));
        System.out.println("amount of cities : " + cities.size());
        cities.remove(0);
        System.out.println("cities = " + cities);

    }
}
