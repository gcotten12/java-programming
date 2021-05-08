package day41_arraylist;

import java.util.ArrayList;

public class Cities {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("Dallas"); cities.add("Rockwall"); cities.add("Mesquite"); cities.add("Forney");
        cities.add("Terrell");

        System.out.println(cities.contains("Rockwall"));
        System.out.println(cities.isEmpty());
        System.out.println(cities.remove("Terrell"));
        System.out.println(cities);
        cities.add("Terrell");
        cities.add(0, "Fort Worth");
        System.out.println(cities);
        System.out.println("first city = " + cities.get(1) + " - last city = " + cities.get(cities.size()-1));

        for(int i = 0; i < cities.size(); i++) {
            System.out.print(cities.get(i) + " ");
        }

        System.out.println();

        cities.clear();
        System.out.println(cities);

    }


}
