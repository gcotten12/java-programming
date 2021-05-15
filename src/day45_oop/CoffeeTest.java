package day45_oop;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        System.out.println("amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount = " + myCoffee.getAmount());
        myCoffee.drinkSome(50);
        System.out.println("amount = " + myCoffee.getAmount());

    }
}
