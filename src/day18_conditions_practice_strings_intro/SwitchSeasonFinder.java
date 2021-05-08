package day18_conditions_practice_strings_intro;

public class SwitchSeasonFinder {
    public static void main(String[] args) {
        int month = 2;
        switch(month) {
            case 12: case 1: case 2:
            System.out.println("Winter");
            break;
            case 3: case 4: case 5:
                System.out.println("Spring");
                break;
            case 6: case 7: case 8:
                System.out.println("Summer");
                break;
            case 9: case 10: case 11:
                System.out.println("Fall");
                break;
        }
        int x = 10;
        int y = x++;
        System.out.println(y++ +" " + x++ + " " + y);

        int num = 1;
        if (num++ == 2) {
            System.out.println("passed"+num);
        }else {
            System.out.println("fail"+num);
        }
    }
}
