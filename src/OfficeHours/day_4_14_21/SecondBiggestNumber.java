package OfficeHours.day_4_14_21;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        int [] nums = {9, 4, 3, 1, 4, 5, 2, 4, 8, 4, 8};
        int max = nums[0];
        int secondMax = 0;

        for(int eachNum : nums) {

            if(eachNum > max) {
                secondMax = max;
                max = eachNum;
            }

            if(eachNum > secondMax && eachNum < max) {
                secondMax = eachNum;
            }
        }
        System.out.println("Max = " + max + " | Second Max = " + secondMax);
    }
}
