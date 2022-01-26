package ExtraPractice.ArrayList_Taks;

import java.util.*;

public class StringNumbersToSum {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(
            Arrays.asList("123","84","251"));
        List<Integer> digits = new ArrayList<>();
        int temp = 0;
        for (String each : numbers) {
            for (int i = 0; i < each.length(); i++) {
                int n = Integer.parseInt(each.charAt(i)+"");
                temp+=n;
            }
            digits.add(temp);
            temp = 0;
        }

        System.out.println(digits);


    }
}
