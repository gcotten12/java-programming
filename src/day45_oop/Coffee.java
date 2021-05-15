package day45_oop;

public class Coffee {

    int amount;
    String type;

    public void refill() { amount = 100; }
    public void drinkSome(int amountDrank) { amount -= amountDrank; }
    public int getAmount() { return amount; }

    public void setType(String typeOfCoffee) { type = typeOfCoffee; }
    public void getType() { System.out.println("coffee type = " + type); }

}
