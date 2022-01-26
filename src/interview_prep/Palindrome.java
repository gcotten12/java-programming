package interview_prep;

public class Palindrome {

    public static void main(String[] args) {

        String str = "Garrett";
        System.out.println(isPalindrome(str));
        String str2 = "racecar";
        System.out.println(isPalindrome(str2));

    }

    public static boolean isPalindrome(String str) {
        String reversed = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equalsIgnoreCase(str);
    }

}
