package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVOID("cybertekStudent","Abc123"); // Positive test
        loginVOID("cybertechStudent", "Abc123");

        loginReturn("cybertekStudent", "Abc123"); //nothing prints
        System.out.println(loginReturn("cybertekSTudent", "Abc123"));
        boolean correctLogin = loginReturn("cybertekStudent", "Abc123");
        System.out.println(correctLogin);

    }
    public static void loginVOID(String username, String password) {
        String secretUsername = "cybertekStudent", secretPassword = "Abc123";

        if(username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login Successful\nWelcome Cybertek Student!");
        }else{
            System.out.println("Login Failed");
        }
    }

    public static boolean loginReturn(String userName, String password) {
        String secretUsername = "cybertekStudent", secretPassword = "Abc123";

        return (userName.equalsIgnoreCase(secretUsername) && password.equals(secretPassword));
                        // BOTH ARE SAME RESULT. THE TOP IS JUST SHORTER
       // if(userName.equalsIgnoreCase(secretUsername) &&
       //         password.equals(secretPassword)) {
       //     return true; // return true and exit method here. return false will not run
       // }
       //     return false;

    }
}
