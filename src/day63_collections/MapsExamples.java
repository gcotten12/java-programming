package day63_collections;

import java.util.HashMap;
import java.util.Map;

public class MapsExamples {
    public static void main(String[] args) {
        // (id, names)
        // print order is based on the implementation order
        // HashMap is good for
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "James");
        map.put(2, "Anna");
        map.put(2, "Daria"); // this line will change the value of key 2 from Anna to Daria
        map.put(100, "Maxim");
        map.put(10, "Garrett");

        System.out.println(map);
        System.out.println(map.get(100)); // will print the value of that key
        map.replace(2, "Anna");
        System.out.println(map);
        map.remove(10);// you can only remove the key not the value
        System.out.println(map);
        System.out.println(map.get(15));
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Garrett"));

        for(Integer key : map.keySet()) {
            System.out.println(key + " - " + map.get(key));
        }

    }
}
