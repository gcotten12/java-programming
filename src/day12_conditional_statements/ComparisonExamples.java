package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45, speedLimit = 55;
        boolean isSpeeding = currentSpeed>speedLimit;
        System.out.println("If Im driving "+currentSpeed+"mph and the speed limit is "+speedLimit+", am I speeding?\n"+isSpeeding);
        System.out.println();
        double accountBalance = 200.00;
        double shoes = 99.99;
        System.out.println("can I afford the shoes: " + (shoes<=accountBalance));
        accountBalance -=shoes;
        System.out.println("My account balance is now: "+accountBalance);
    }
}
