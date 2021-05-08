package OfficeHours.day_4_6_21;

public class Palindrome {
    public static void main(String[] args) {
        String word = "anna";
        boolean isPalindrome = true;

        for(int i = 0; i < word.length()/2; i++) { // we divide by 2 because we will know it is a palindrome once we get halfway

            if(word.charAt(i) != word.charAt(word.length()-1 - i)) {
                isPalindrome = false;
                break;
            }

        }

        System.out.println("Is Palindrome: "+ isPalindrome);

    }
}
