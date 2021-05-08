package OfficeHours.day_4_19_21;

public class MethodClass {

    public static void methodOne() {
        System.out.println("One");
    }

    public static String methodTwo() {
        return "Two";
    }

    public static int methodThree(String word) {
        return word.length();
    }

    public static boolean login(String username, String password) {
        if(username.equalsIgnoreCase("yes") || password.equals("yes")) {
            return true;
        }
            return false;
    }



}
