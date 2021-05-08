package ReplitCode;

import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int result = n;

        for(int i = n-1; i > 0; i--) {
            result *= i;
            n--;
        }
        System.out.println(result);
    }
}
