package day40_arraylist;

import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        List list2 = new ArrayList();

        list.add("java");
        list.add("apples");
        list.add("coffee");
        list.add(1234);
        list.add(55.2);
        list.add(true);
        list.add("wooden spoon");

        System.out.println(list);
        System.out.println("list = " + list.size());
    }
}
