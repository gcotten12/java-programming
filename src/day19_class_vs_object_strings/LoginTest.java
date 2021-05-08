package day19_class_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String expUser = "Cybertek", expPass = "Abc123";
        String user = "cybertek", pass = "Abc123";

        if (user.equalsIgnoreCase(expUser) && pass.equals(expPass)) {
            System.out.println("Login successful");
        } else {
            if (!expUser.equalsIgnoreCase(user)) {
                System.out.println("Fail - username is incorrect");
            } else {
                System.out.println("Fail - password is incorrect");
            }
        }
    }
}