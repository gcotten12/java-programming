package day23_string_manipulation_while_loop;

public class FirstLoop {
    public static void main(String[] args) {
        int i = 1;
        if(i<=5) {
            i += i;
            System.out.println(i);
        }
        while(i<=5) {
            System.out.println("i = " + i);
            i++;
        }

        int number = 5;

        while(number < 100) {
            number += number;
        }
        System.out.println(number);
    }
}
