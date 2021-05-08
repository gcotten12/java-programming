package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        System.out.println(isNullOrEmpty(""));
        System.out.println(isNullOrEmpty("hello"));
        System.out.println(isNullOrEmpty(null));

        String username = "";
        if(StringUtils.isNullOrEmpty(username)) {
            System.out.println("Fail: Username cannot be null or empty");
        }

        System.out.println();

        System.out.println(StringUtils.isPalindrome("racecar"));
        System.out.println(isPalindrome("hello")); // we did not have to type StringUtils because we imported the class

        System.out.println();

        System.out.println(reverse("hello"));
    }
}
