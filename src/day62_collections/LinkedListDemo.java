package day62_collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> friends = new LinkedList<>();
        //polymorphism
        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(42);
        System.out.println(scores);
        System.out.println("first score = " + scores.get(0));
        System.out.println("1 = " + scores.get(1));

        friends.add("Garrett");
        friends.add("Evan");
        friends.add("Zach");
        friends.addFirst("Miguel");
        System.out.println("friends = " + friends);

    }
}
