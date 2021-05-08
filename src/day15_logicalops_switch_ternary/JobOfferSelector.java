package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String city = "Dallas", benefits = "health, eye, dental";
        boolean isRemote = true;
        double salary = 85_000;
        if (city.equals("Dallas") && benefits.equals("health, eye, dental") && isRemote && salary >= 85_000) {
            System.out.println("Then I will move forward with this job!");
        } else {
            System.out.println("I will keep searching!");
        }
    }
}
