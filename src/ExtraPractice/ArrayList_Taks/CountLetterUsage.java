package ExtraPractice.ArrayList_Taks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountLetterUsage {
    public static void main(String[] args) {
        char letter = 'a';
        List<String> list = new ArrayList<>(
                Arrays.asList("Garrett","Evan","Zach","Miguel"));
        int count = 0;
        for (String each : list) {
            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i)==letter) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}
