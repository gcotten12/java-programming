package day46_encapsulation;

public class CarCatalog {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.carInfo("VW", 2015, 78_000);
        System.out.println(car1);

        Car car2 = new Car();
        car2.carInfo("Ford f-150", 2017, 90_000);
        System.out.println(car2);

    }
}
