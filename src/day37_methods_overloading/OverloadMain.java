package day37_methods_overloading;

import java.util.Arrays;

public class OverloadMain {
    public static void main(String[] differentName) {
        System.out.println("hello");
        main(10);
        System.out.println(Arrays.toString(differentName));
    }

    /**
        overload main method:
        same name + different parameter
     */

    public static void main(int num) {
        System.out.println("num = " + num);
    }
}
