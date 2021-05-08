package OfficeHours.day_past;

import java.util.*;

public class Sandwich {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();

        if(str.contains("bread")) {

         int firstBread = str.indexOf("bread");

         if(str.substring(firstBread+5).contains("bread")) { //jambread

             int secondBread = str.substring(firstBread+5).indexOf("bread");

             System.out.println("2 bread");
         }else {
             System.out.println("1 bread");
         }

        }else {
            System.out.println("nothing");
        }
    }
}
