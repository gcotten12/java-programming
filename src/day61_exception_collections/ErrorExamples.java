package day61_exception_collections;

import java.util.ArrayList;
import java.util.List;

public class ErrorExamples {
    public static void main(String[] args) {

        //StackOverFlowError
        myMethod();

        //OutOfMemoryError
        List<Integer> nums = new ArrayList<>();
        while(true) {
            nums.add(1);
        }

    }

    static void myMethod() {
        while(true) {
            System.out.println("hi");
        }
    }

}
