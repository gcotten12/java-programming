package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        double price = 0.0;
        int calories = 0;
        String size = "tall";

        switch (size) {
            case "tall":
                System.out.println("Tall Cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "grande":
                System.out.println("Grande Cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "venti":
                System.out.println("Venti Cappuccino please");
                price = 4.29;
                calories = 150;
            default:
                System.out.println("We do not have any other size");
        }
        System.out.println("Total price: $"+price+"\nYou will consume "+calories+"cal of energy");
    }
}
