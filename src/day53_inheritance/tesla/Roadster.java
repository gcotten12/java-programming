package day53_inheritance.tesla;

public class Roadster extends ElectricCar {

                //    "Roadster"      200000      2022      620
    public Roadster(String model, double price, int year, int range) {
        super("Tesla", model, price, year, range);
        // anything we want to type must come after super
        System.out.println("Welcome new Roadster");
    }
}
