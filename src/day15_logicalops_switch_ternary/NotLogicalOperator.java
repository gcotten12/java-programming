package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = "+!true);
        System.out.println("!false = "+!false);

        int mag = 30;
        System.out.println(!(mag < 30));

        String model = "S&M";
        if (!(mag<=30) && model.equals("Colt") || model.equals("S&M")) {
            System.out.println("I will buy the rifle");
        }else {
            System.out.println("I will look for another rifle");
        }
        boolean isSmokingAllowed = false;

        //if smoking is not allowed: print "Smoking is not allowed here. Exit"
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit");
        }else {
            System.out.println("You are allowed to smoke here");
        }

        boolean isAffordable = true;

        //if its NOT affordable then print "Item Not affordable"
        if (!isAffordable) {
            System.out.println("Item not affordable");
        }else {
            System.out.println("Item affordable");
        }

        String carModel = "Tesla";
        if (!carModel.equals("Tesla")) {
            System.out.println("Then Not intereste");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!secretPassword.equals("abc321")) {
            System.out.println("Incorrect Password");
        }
        if (!inputPassword.equals("abc321")) {
            System.out.println("Correct Password");
        }else {
            System.out.println("Incorrect Password");
        }
    }

}
