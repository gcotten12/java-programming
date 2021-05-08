package day15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true " + (true || true));
        System.out.println("true || false = "+(true || false));
        System.out.println("false || false = " + (false || false));

        int apples = 5, oranges = 7;

        System.out.println(apples>3 || oranges>4);
        if (apples > 3 || oranges > 4) {
            System.out.println("No need to buy any fruit today!");
        }else {
            System.out.println("I need to go to the store!");
        }

        System.out.println(apples > 2 || oranges > 10);
    }
}
