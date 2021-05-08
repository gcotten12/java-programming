package day38_methods;

public class StringUtils {

    public static boolean isNullOrEmpty(String str) {
//        if(str == null || str.isEmpty()) {
//            return true;
//        }
//            return false;
        return str == null || str.isEmpty();
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
                return true;
    }

    public static String reverse(String str) {
        String reverse = "";
        for(int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
