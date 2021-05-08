package day42_arraylist;

import java.util.*;

public class CollectionsUtil {

    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a','v','a','i','s','f','u','n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);

        Collections.reverse(letters);
        System.out.println(letters);

        System.out.println(Collections.frequency(letters, 'a'));

        int vCount = Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);

        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a','u');
        Collections.replaceAll(letters, 'i','j');
        System.out.println("after replaceAll = " + letters);

        Collections.sort(letters);
        System.out.println("After sort = " + letters);


        List<Integer> nums = Arrays.asList(23, 1, 43, 5, 234, 7, -9, 0, 7);

        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        int countOf7s = Collections.frequency(nums, 7);
        System.out.println("countOf7s = " + countOf7s);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort = " + nums);

        Collections.shuffle(nums);
        System.out.println("After shuffle = " + nums);
    }

}
