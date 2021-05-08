package day28_loops;

public class BrekaVsContinue {
    public static void main(String[] args) {
        for(int i = 0; i <= 5; i++) {
            if(i == 2 || i == 4) {
                System.out.println(i);
                break;
            }
            String s1 = "wooden spoon";
            String s2 = s1.substring(s1.indexOf("s"));
            System.out.println(s2);

        }
    }
}
