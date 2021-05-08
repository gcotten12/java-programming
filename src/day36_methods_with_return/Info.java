package day36_methods_with_return;

import java.util.*;

public class Info {
    public static void main(String[] args) {
        System.out.println("full name: " + fullName());
        System.out.println("Are you married? " + isMarried());
        System.out.println("Age: " + getAge());
        System.out.println(getRandomYear());
        
        String name = fullName();
        Boolean married = isMarried();
        int age = getAge();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);

        if(isMarried()) {
            System.out.println(married);
        }else {
            System.out.println("single");
        }
    }
    public static String fullName(){
        System.out.println("inside fullname method");
        return "Garrett Cotten"; }
    public static Boolean isMarried() {
        return false; }
    public static int getAge() {
        return 20; }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}

