package ReplitCode;

import java.util.*;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.
        int[] newPop = new int[8];
        System.out.println("Day 0 " + Arrays.toString(inhabitants));

        for(int i = 0; i <= 10; i++) {
            int peopleLeft = 0;

            for(int j = 0; j < inhabitants.length; j++) {
                peopleLeft += inhabitants[j];

                if(inhabitants[j] > 0) {
                    inhabitants[j] /= 2;
                    newPop[j] = inhabitants[j];
                }else {
                    newPop[j] = 0;
                }

            }

            if(peopleLeft == 0) {
                System.out.println("---- EXTINCT ----");
                break;
            }else{
                System.out.println("Day " + (i+1) + " " + Arrays.toString(newPop));
            }

        }

    }
}
