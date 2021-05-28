package ReplitCode;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethod {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = {in.nextInt(),in.nextInt(),in.nextInt(),in.nextInt()};
        Arrays.toString(do_switch(arr));
    }


    public static int[] do_switch(int[] i) {
        int[] reverseArr = new int[4];
        for(int h = i.length-1, j = 0; h >= 0; h--, j++) {
            reverseArr[j] = i[h];
        }
        return reverseArr;

    }

}
