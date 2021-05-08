package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        int bonus = 0;
        double salesAmount = 2000.55;
        if (salesAmount <= 1000) {
            System.out.println("Good job, you qualified for bonus!");
            bonus += 300;
        } else {
            System.out.println("Good job, you qualified for full bonus!");
            bonus += 500;
        }
        System.out.println("Your bonus for $" + salesAmount + " of sales is $" + bonus + "!");
    }
}
