package day45_oop;

public class CoffeeTest {

    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        System.out.println("amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount = " + myCoffee.getAmount());
        myCoffee.drinkSome(50);
        System.out.println("amount = " + myCoffee.getAmount());
        myCoffee.setType("mocha frape");
        System.out.println("type of coffee = " + myCoffee.getType());
        System.out.println(myCoffee.toString());

        Coffee coffee1 = new Coffee();
        coffee1.setType("latte");
        System.out.println("coffee1 type = " + coffee1.getType());

        Coffee coffee2 = coffee1; // coffee2 will go to the stack but nothing will be added
                                  // to the heap because that object is already there

    }
}
