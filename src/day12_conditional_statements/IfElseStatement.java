package day12_conditional_statements;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
/*        System.out.println("Grade on Test: ");
        int grade = scan.nextInt();
        if (grade > 70) {
            System.out.println("Student passed the test!");
        } else {
            System.out.println("Student failed the test:(");
*/
        System.out.println();

        Scanner in = new Scanner(System.in);
        System.out.println("Hey, do you like Strawberries?");
        String response = in.next();
        if (response == "yes") {
            System.out.println("Awesome, me too!");
        } else {
            System.out.println("Why not?");
        }
        if (response != "yes") {
            String response2 = in.next();
            System.out.println("Aww man, that sucks!");
        }



    }
}