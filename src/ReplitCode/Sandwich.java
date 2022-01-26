package ReplitCode;

import java.util.*;

public class Sandwich {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.substring(0, str.length() / 2).contains("bread") &&
                str.substring(str.length() / 2).contains("bread")) {

//            String firstBread;
//            String secondBread;
            String between;
//
//            firstBread = str.substring(0, str.indexOf("d") + 1);
//            secondBread = str.substring(str.lastIndexOf("b"), str.length());
//            between = str.substring(str.indexOf(firstBread), str.indexOf(secondBread));
            between = str.substring(str.indexOf("d")+1,str.lastIndexOf("b"));

            System.out.println(between);


        } else {
            System.out.println("nothing");
        }

    }
}
