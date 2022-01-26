package interview_prep;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        //System.out.println(removeDups("AAABBBCCC"));
        System.out.println(removeDups2("AAABBBCCC"));
    }

    /*
    Write a return method that can remove the duplicated values from String
    Ex:  removeDup("AAABBBCCC")  ==> ABC
     */

    public static String removeDups(String str) {

        String placeHolder = "";

        for(int i = 0; i < str.length(); i++) {

            if(!placeHolder.contains(""+str.charAt(i))) {

                placeHolder+=str.charAt(i);

            }

        }

        return placeHolder;

    }

    public static String removeDups2(String str) {

        String[] newStr = str.split("");

        Set<String> st = new HashSet<>(Arrays.asList(newStr));

        return st.toString();

    }

}
