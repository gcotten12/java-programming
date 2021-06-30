package ReplitCode;

import java.util.*;

public class CombineArrayList {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int size2 = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.nextInt());
        }
        for(int i=0; i < size2; i++) {
            list2.add(in.nextInt());
        }

        System.out.println(combineAL(list, list2));

    }

    public static ArrayList<Integer> combineAL
            (ArrayList<Integer> numbersOne, ArrayList<Integer> numbersTwo) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(numbersOne.get(0));
        list1.add(numbersOne.get(1));
        list1.add(numbersOne.get(2));
        list1.add(numbersTwo.get(0));
        list1.add(numbersTwo.get(1));
        list1.add(numbersTwo.get(2));

        return list1;

    }

}
