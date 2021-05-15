package day45_oop;

public class ComparingObjects {

    public static void main(String[] args) {

        String word1 = "java"; // in string pool
        String word2 = "java"; // reuse from string pool
        String word3 = new String("java"); // create in heap, outside of string pool
        String word4 = new String("java"); // create in heap, outside of string pool


        System.out.println(word1 == word2);
        System.out.println(word1 == word3);
        System.out.println(word3 == word4);


    }
}
