package day40b_review_class;

public class SumOfNumbers {

    public static void main(String[] args) {
        System.out.println("sum = " + getSumFromString("a5bc12def100"));
    }
    public static int getSumFromString(String str) {
        int sum = 0;
        String num = "";

        for(int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i))) { // checks if every character is a number
                num += str.charAt(i);

                if(i == str.length()-1 || !Character.isDigit(str.charAt(i + 1))) {

                    sum += Integer.parseInt(num);
                    num = ""; // reset for next number
                }

            }


        }
        return sum;
    }
}
