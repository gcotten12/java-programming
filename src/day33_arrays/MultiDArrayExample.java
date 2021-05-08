package day33_arrays;

import java.util.*;

public class MultiDArrayExample {
    public static void main(String[] args) {
        String[][] users = new String[3][2];
        users[0][0] = "garrett";
        users[0][1] = "cotten";
        users[1][0] = "evan";
        users[1][1] = "roberts";
        users[2][0] = "zach";
        users[2][1] = "waldrep";

        String[][] userData = {{"garrett", "cotten"},
                                {"evan", "roberts"},
                                {"zach", "waldrep"} };

        System.out.println(userData[0][0]);
        System.out.println(userData[1][0]);
        System.out.println(userData[2][0]);

        System.out.println(Arrays.deepToString(userData));
    }
}
