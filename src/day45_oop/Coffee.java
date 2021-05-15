package day45_oop;

public class Coffee {

    int amount;
    String type;

    @Override
    public String toString() {
        return "Coffee{" +
                "amount=" + amount +
                ", type='" + type + '\'' +
                '}';
    }

    public void refill() { amount = 100; }
    public void drinkSome(int amountDrank) { amount -= amountDrank; }
    public int getAmount() { return amount; }

    public void setType(String typeOfCoffee) { type = typeOfCoffee; }
    public String getType() { return type; }

}
