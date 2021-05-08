package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLastSSN = 1234;
        int expPinCode = 4321;

        int last4SSN = 1234;
        int pinCode = 4322;

        if (expLastSSN == last4SSN && expPinCode == pinCode) {
            System.out.println("Authentication seccessful!");
        }else {
            System.out.println("Access Denied!");
            if (last4SSN != 1234) {
                System.out.println("Last 4 SSN was unsuccessful");
                if (pinCode != 4321) {
                    System.out.println("Pin code was unsuccessful");
                }
            }
        }
    }
}
