package day25_loops;

import java.util.*;

public class StartEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Start and End: ");
        int start = s.nextInt(), end = s.nextInt();
        if(start>end){
            System.out.println("reverse numbering is not supported");
        }
        for(int i = start; i <= end; i++) {
            System.out.println(i + " ");
        }
    }
}
