package ReplitCode;

import java.util.*;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];

        //WRITE YOUR CODE HERE
        float max = score[0], min = Float.MAX_VALUE;
        float sum = 0;
        for(int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge "+ (i+1) + ":");
            score[i] = input.nextFloat();

            if(score[i] > max) {
                max = score[i];
            }
            if(score[i] < min) {
                min = score[i];
            }

            sum += score[i];
        }

        sum = sum - max - min;

        System.out.println("Enter difficulty:");
        float difficulty = input.nextFloat();
        float finalScore = sum * difficulty * 0.6f;
        System.out.println("Total: " + (finalScore));

    }
}
