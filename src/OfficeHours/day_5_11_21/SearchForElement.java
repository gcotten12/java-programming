package OfficeHours.day_5_11_21;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchForElement {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "three", "two"));

        System.out.println(findIndex(list, "two"));
        System.out.println(findIndex(list, "two", 2));


    }

    /**
     *
     * @param words - List of elements given
     * @param element - The element that we are looking for
     * @return - The method returns the index where the element is found in the given ArrayList
     *              and if the element that does not exist the method returns -1
     */

    public static int findIndex(ArrayList<String> words, String element) {

        int index = -1;

        for(int i = 0; i < words.size(); i++) {
            if(words.get(i).equals(element)) {
                index = i;
                break;
            }
        }

        return index;
    }

    /**
     *
     * @param words - List of elements given
     * @param element - The elements that we are looking for
     * @param startIndex - the index where the search starts from
     * @return - the method returns the index where the element is found in the given ArrayList
     */

    public static int findIndex(ArrayList<String> words, String element, int startIndex) {

        int index = -1;

        for(int i = startIndex; i < words.size(); i++) {
            if(words.get(i).equals(element)) {
                index = i;
                break;
            }
        }

        return index;
    }

}
