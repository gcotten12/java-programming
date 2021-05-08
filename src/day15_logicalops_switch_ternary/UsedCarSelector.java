package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        int budget = 10000, carPrice = 7500;
        String model = "Volkswagen";
        if (carPrice <= budget && model.equals("Volkswagen") || model.equals("BMW") || model.equals("Audi")) {
            System.out.println("I will buy the " + model + " for " + carPrice + " because it is within my budget of " + budget + ".");
        } else {
            System.out.println("I will continue looking for a vehicle that meets my requirements.");
        }
    }
}
