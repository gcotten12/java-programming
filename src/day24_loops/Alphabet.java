package day24_loops;

public class Alphabet {
    public static void main(String[] args) {
        char letter = 'a';
        while(letter <= 'z') {
            System.out.println("letter = " + letter);
            letter++;
        }
        System.out.println("This is the full alphabet");
        System.out.println();
        //reverse alphabet
        letter = 'z';
        while(letter >= 'a') {
            System.out.println("letter = " + letter);
            letter--;
        }
        System.out.println("Full alphabet in reverse");
    }
}
