package OfficeHours.day_4_19_21;


import day38_methods.StringUtils;

public class ReverseEachWord {
    public static void main(String[] args) {
        System.out.println(reverseEachWord("It started to snow in Chicago"));
    }

    public static String reverseEachWord(String str) {

        String reverse = "";

        for(String each : str.split(" ")) {

            String eachReverse = "";

            reverse += StringUtils.reverse(each) + " ";
        }

        return reverse;
    }
}
