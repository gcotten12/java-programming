package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Miami";
        if (city.equals("Tampa Bay") || city.equals("Miami")) {
            System.out.println("I will consider relocating");
        } else {
            System.out.println("I will not consider relocating");
        }

        //company - "Google", salary >= 100_000
        String company = "Google";
        double salary = 100_000;
        if (company.equals("Google") || salary >= 100_000) {
            System.out.println("I will consider the job offer");
        } else {
            System.out.println("I will not take the job");
        }
    }
}