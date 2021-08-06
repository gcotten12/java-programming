package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // LIFO

        Stack<String> books = new Stack<>();
        books.add("Harry Potter");
        books.add("Leaders eat last");
        books.add("Java Intro");
        System.out.println(books);
        // books.pop(); // removes and returns the top of the stack item
        // System.out.println(books.remove(0));
        System.out.println("This is at the top of the stack: " + books.peek());

        System.out.println("Final version: " + books);

    }
}
