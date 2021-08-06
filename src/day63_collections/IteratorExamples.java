package day63_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExamples {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");
        System.out.println(list);

        Iterator<String> it = list.iterator();

        it.next();
        it.remove();

        System.out.println(list);


    }
}
