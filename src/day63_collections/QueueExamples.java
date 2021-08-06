package day63_collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExamples {
    public static void main(String[] args) {
        //FIFO

        Queue<String> queue = new ArrayDeque<>();
        queue.add("one");
        queue.add("two");
        queue.add("one");
        queue.add("one");
        queue.add("four");
        queue.add("five");

        System.out.println(queue);

        System.out.println(queue.element()); // element will show us what's at the top
        System.out.println(queue.peek()); // element will show us what's at the top

        System.out.println(queue.remove()); // if nothing is there than we have a problem
        System.out.println(queue.poll()); // if something is there than it will return it and remove it, if not than it will return null

        System.out.println(queue);


    }
}
