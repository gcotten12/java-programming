package day58_polymorphism.shopping_polymorphism_example;

public abstract class OnlineShop {
    public abstract void buy();
    public abstract void sell();
    public void ship() {
        System.out.println("Shipping the purchased item");
    }
}
