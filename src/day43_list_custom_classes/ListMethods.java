package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListMethods {

    public static void main(String[] args) {

//        List<String> daysOfTheWeek = getDays();
//        System.out.println(daysOfTheWeek);
//
//        daysOfTheWeek.removeIf(day -> day.length() == 6); // this method is declaring a variable(day) for each index and if the length of that index equals 6 then it will be removed
//        System.out.println("daysOfTheWeek = " + daysOfTheWeek);

        System.out.println(getRandomList(10));

    }

    public static List<String> getDays() {
        List<String> days = new ArrayList<>();
        days.add("Monday"); days.add("Tuesday"); days.add("Wednesday");
        days.add("Thursday"); days.add("Friday"); days.add("Saturday");
        days.add("Sunday");

        return days;
    }

    public static List<Integer> getRandomList(int size) {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            nums.add(random.nextInt(101));
        }
        return nums;
    }
}
